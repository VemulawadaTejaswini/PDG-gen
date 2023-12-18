import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		myBTree tree=new myBTree();

		int q=in.nextInt();
		for(int i=0;i<q;i++) {
			String odr=in.next();

			switch(odr.charAt(0)) {
			case 'i':
				tree.inset(Integer.parseInt(in.next()));
				break;
				
			case 'd':
				tree.remove(Integer.parseInt(in.next()));
				break;

			case 'f':
				System.out.println((tree.contains(Integer.parseInt(in.next()))? "yes":"no"));
				break;

			case 'p':
				tree.walk('m');
				tree.walk('f');
				break;
			}
		}

		in.close();

	}

}

class BTNode{
	int v;
	BTNode p,lc,rc;

	BTNode(int n){
		v=n;
	}
}

class myBTree{
	private BTNode EDG,ROOT;

	myBTree(){
		EDG=new BTNode(-1);
		ROOT=EDG;
	}
	
	
	/*-----insert-----*/
	void inset(int v) {
		BTNode NEW=new BTNode(v);
		NEW.lc=EDG; NEW.rc=EDG;

		if(ROOT==EDG) {
			ROOT=NEW;
			ROOT.p=EDG;
		}
		else {
			BTNode NOW=ROOT;
			while(true) {
				if(NEW.v<NOW.v) {
					if(NOW.lc==EDG) {
						NOW.lc=NEW;
						NEW.p=NOW;
						break;
					}
					else NOW=NOW.lc;
				}
				else {
					if(NOW.rc==EDG) {
						NOW.rc=NEW;
						NEW.p=NOW;
						break;
					}
					else NOW=NOW.rc;
				}
			}
		}
	}
	
	/*-----search-----*/
	public boolean contains(int key) {
		BTNode NOW=ROOT;

		while(NOW!=EDG) {
			if(key==NOW.v)return true;

			if(key<NOW.v)NOW=NOW.lc;
			else NOW=NOW.rc;
		}

		return false;
	}
	
	public BTNode pointOf(int key) {
		BTNode NOW=ROOT;

		while(NOW!=EDG) {
			if(key==NOW.v)return NOW;

			if(key<NOW.v)NOW=NOW.lc;
			else NOW=NOW.rc;
		}

		return EDG;
	}
	
	/*-----delete-----*/
	public void remove(int key) {
		BTNode RM=pointOf(key);
		delete(RM);
	}
	
	private void delete(BTNode RM) {
		if(RM.lc==EDG && RM.rc==EDG) {
			if(RM.p.lc==RM)RM.p.lc=EDG;
			else RM.p.rc=EDG;
		}
		else if(RM.lc!=EDG && RM.rc==EDG){
			RM.lc.p=RM.p;
			if(RM.p.lc==RM)RM.p.lc=RM.lc;
			else RM.p.rc=RM.lc;
		}
		else if(RM.lc==EDG && RM.rc!=EDG){
			RM.rc.p=RM.p;
			if(RM.p.lc==RM)RM.p.lc=RM.rc;
			else RM.p.rc=RM.rc;
		}
		else {
			BTNode EXC=RM.rc;
			while(EXC.lc!=EDG)EXC=EXC.lc;
			RM.v=EXC.v;
			delete(EXC);
		}
	}

	/*-----walk-----*/
	public void walk(char opt) {
		BTNode NOW=ROOT;

		switch(opt) {
		case 'f':
			preWalk(NOW);
			break;

		case 'm':
			inWalk(NOW);
			break;

		case 'l':
			postWalk(NOW);
			break;
		}

		System.out.println();
	}

	private void preWalk(BTNode NOW) {
		System.out.print(" "+NOW.v);
		if(NOW.lc!=EDG)preWalk(NOW.lc);
		if(NOW.rc!=EDG)preWalk(NOW.rc);
	}

	private void inWalk(BTNode NOW) {
		if(NOW.lc!=EDG)inWalk(NOW.lc);
		System.out.print(" "+NOW.v);
		if(NOW.rc!=EDG)inWalk(NOW.rc);
	}

	private void postWalk(BTNode NOW) {
		if(NOW.lc!=EDG)postWalk(NOW.lc);
		if(NOW.rc!=EDG)postWalk(NOW.rc);
		System.out.print(" "+NOW.v);
	}



}
