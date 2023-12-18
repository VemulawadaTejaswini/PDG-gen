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
				
			case 'p':
				tree.walk('m');
				tree.walk('f');
				break;
			}
		}
		
		
		
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
