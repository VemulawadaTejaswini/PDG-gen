
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        PrintWriter out=new PrintWriter(System.out);
        myMultiSet mset=new myMultiSet();
        int q=Integer.parseInt(in.next());
        for(int i=0;i<q;i++) {
            int odr=Integer.parseInt(in.next());

            switch(odr) {
            case 0:
            	int x0=Integer.parseInt(in.next());
            	mset.insert(x0);
            	out.println(mset.size());
            	break;

            case 1:
            	int x1=Integer.parseInt(in.next());
            	out.println(mset.find(x1));
            	break;

            case 2:
            	int x2=Integer.parseInt(in.next());
            	mset.deleteOf(x2);
            	break;

            case 3:
            	out.flush();
            	int L=Integer.parseInt(in.next()),R=Integer.parseInt(in.next());
            	mset.dump(L, R);
            	break;
            }
        }
        out.flush();
    }

}

class Bnode{
    int v,num;
    Bnode p,l,r;

    Bnode(int v,int num){
        this.v=v;
        this.num=num;
    }
}

class myMultiSet{
	PrintWriter out=new PrintWriter(System.out);
	Bnode NOW,END,ROOT;
	int size,fact;

	myMultiSet(){
		END=new Bnode(-1,-1);
		END.p=END;
		END.l=END;
		END.r=END;
		init();
		size=0;
		fact=0;
	}
	private void init() {
		ROOT=END;
	}

	void insert(int x) {
		Bnode NEW=new Bnode(x,1);
		NEW.l=END;
		NEW.r=END;
		if(fact==0) {
			ROOT=NEW;
			//exist[x]=true;
			fact++;
		}
		else {
			NOW=ROOT;
			while(true) {
				if(NEW.v==NOW.v) {
					NOW.num++;
					break;
				}
				else if(NEW.v<NOW.v) {
					if(NOW.l==END) {
						NOW.l=NEW;
						NEW.p=NOW;
						fact++;
						//exist[x]=true;
						break;
					}
					else NOW=NOW.l;
				}
				else {
					if(NOW.r==END) {
						NOW.r=NEW;
						NEW.p=NOW;
						fact++;
						//exist[x]=true;
						break;
					}
					else NOW=NOW.r;
				}
			}
		}
		size++;
	}

	int size() {
		return size;
	}

	private Bnode search(int x) {
		NOW=ROOT;
		while(true) {
			//System.out.println("SEARCHING:"+NOW.v);
			if(x==NOW.v)break;
			else if((x<NOW.v && NOW.l.v==-1) || (x>NOW.v && NOW.r.v==-1))break;
			else if(x<NOW.v)NOW=NOW.l;
			else NOW=NOW.r;
		}
		return NOW;
	}

	int find(int x) {
		Bnode T=search(x);
		return (T.v==x)?T.num : 0;
	}

	void deleteOf(int x) {
		Bnode T=search(x);
		//System.out.println("x="+x+"T.v="+T.v);
		if(T.v==x){
			size-=T.num;
			delete(T);
			fact--;
		}
	}

	private void delete(Bnode Del) {
		if(Del.l!=END && Del.r!=END) deleteHaveChilds(Del);
		else if(Del.l!=END || Del.r!=END) deleteHaveaChild(Del);
		else if(Del.l==END && Del.r==END) deleteNoChild(Del);
		else System.out.println("ERR");
	}

	private void deleteNoChild(Bnode D) {
		//System.out.printf("D.v=%d D.p.v=%d",D.v,D.p.v);
		if(fact==1)init();
		else if(D.p.l==D)D.p.l=END;
		else D.p.r=END;
	}

	private void deleteHaveaChild(Bnode D) {
		Bnode child;
		if(D.l!=END)child=D.l;
		else child=D.r;

		if(D==ROOT)ROOT=child;
		else if(D.p.l==D)D.p.l=child;
		else D.p.r=child;

		child.p=D.p;
	}

	private void deleteHaveChilds(Bnode D) {
		Bnode Sub=findNextNodeToDelete(D.r);
		D.v=Sub.v;
		D.num=Sub.num;
		delete(Sub);
	}

	private Bnode findNextNodeToDelete(Bnode N) {
		if(N.l!=END) return findNextNodeToDelete(N.l);
		else return N;
	}

	void dump(int L,int R) {
		for(int i=L;i<=R;i++){
			Bnode T=search(i);
			if(T.v==i){
				for(int j=0;j<T.num;j++)out.println(i);
			}
		}
		/*NOW=ROOT;
		inodrwalk(NOW,L,R);*/
		out.flush();
	}

	private void inodrwalk(Bnode N,int L,int R) {
		if(N.l!=END)inodrwalk(N.l,L,R);
		if(N.v>=L && N.v<=R) {
			for(int j=0;j<N.num;j++)out.println(N.v);
		}
		if(N.r!=END)inodrwalk(N.r,L,R);
	}

}
