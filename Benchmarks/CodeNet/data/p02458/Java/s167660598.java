import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        Mymset mset=new Mymset();
        int q=Integer.parseInt(in.next());
        for(int i=0;i<q;i++) {
            int odr=Integer.parseInt(in.next());
            switch(odr) {
            case 0:
                System.out.println(mset.insert(Integer.parseInt(in.next())));
                break;
                 
            case 1:
                System.out.println(mset.find(Integer.parseInt(in.next())));
                break;
                 
            case 2:
                mset.removeOf(Integer.parseInt(in.next()));
                break;
                 
            case 3:
                mset.dump(Integer.parseInt(in.next()),Integer.parseInt(in.next()));
                break;
            }
        }
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
 
class Mymset{
    Bnode root,dummy,NOW;
    int size;
    PrintWriter out=new PrintWriter(System.out);
     
    Mymset(){
        dummy=new Bnode(-1,-1);
        dummy.p=dummy; dummy.l=dummy; dummy.r=dummy;
        init();
        size=0;
    }
 
    void init() {
        root=dummy;
    }
 
    int insert(int x) {
        Bnode NEW=new Bnode(x,1);
        NEW.l=dummy;NEW.r=dummy;
        if(size==0) {
            root=NEW;
            root.p=dummy;
        }
        else {
            //Bnode NOW=root;
            NOW=root;
            while(true) {
                if(NOW.v==NEW.v) {
                    NOW.num++;
                    break;
                }
                else if(NEW.v>NOW.v) {
                    if(NOW.r.v==-1) {
                        NOW.r=NEW;
                        NEW.p=NOW;
                        break;
                    }
                    else NOW=NOW.r;
                }
                else {
                    if(NOW.l.v==-1) {
                        NOW.l=NEW;
                        NEW.p=NOW;
                        break;
                    }
                    else NOW=NOW.l;
                }
            }
        }
        size++;
        return size;
    }
 
    void removeOf(int x){
        find(x);
        int n=NOW.num;
        if(NOW.r.v==-1 && NOW.l.v==-1){
        	System.out.println("delete mode 0");
            if(NOW.p.l==NOW)NOW.p.l=dummy;
            else NOW.p.r=dummy;
            
            if(size-n==0)init();
        }
        else if((NOW.r.v!=-1 && NOW.l.v==-1) || (NOW.l.v!=-1 && NOW.r.v==-1)) {
        	System.out.println("delete mode 1");
        	if(NOW==root) {
        		if(root.l.v==-1)root=root.r;
        		else root=root.l;
        	}
        	else if(NOW.p.r==NOW) {
                NOW.p.r=NOW.r;
                NOW.r.p=NOW.p;
            }
            else {
                NOW.p.l=NOW.l;
                NOW.l.p=NOW.p;
            }
        }
        else {
        	System.out.println("delete mode 2");
            Bnode y=findNextNode(NOW.r);
            NOW.v=y.v;
            NOW.num=y.num;
            if(y.r.v==-1 && y.l.v==-1){
                if(y.p.l==y)y.p.l=dummy;
                else y.p.r=dummy;
            }
            else if((y.r.v!=-1 && y.l.v==-1) || (y.l.v!=-1 && y.r.v==-1)) {
                if(y.p.r==y) {
                    y.p.r=y.r;
                    y.r.p=y.p;
                }
                else {
                    y.p.l=y.l;
                    y.l.p=y.p;
                }
            }
        }
        size-=n;
    }
     
     
    Bnode findNextNode(Bnode node) {
        if(node.l.v!=-1)return findNextNode(node.l);
        else return node;
    }
 
    int find(int x){
        NOW=root;
        while(NOW.v!=-1) {
 
            if(NOW.v==x)break;
            else if(NOW.v>x)NOW=NOW.l;
            else NOW=NOW.r;
        }
        return (NOW.num>0)?NOW.num : 0;
    }
 
    void dump(int L,int R) {
        inwalk(root,L,R);
        out.flush();
    }
 
    void inwalk(Bnode now,int L,int R) {
        if(now.v>=L && now.v<=R) {
            if(now.l.v!=-1)inwalk(now.l,L,R);
            for(int i=0;i<now.num;i++)out.println(now.v);
            if(now.r.v!=-1)inwalk(now.r,L,R);
        }
    }
 
}
