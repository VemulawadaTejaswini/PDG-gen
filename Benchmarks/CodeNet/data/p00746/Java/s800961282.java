import java.util.Scanner;

class BLOK{
	int left,down,right,up;
	BLOK(){
		this.left=0;
		this.down=0;
		this.right=0;
		this.up=0;
	}
}

public class Main {
	static int n;
	static BLOK b[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,k,posi;

		while(true){
			n=sc.nextInt();
			if(n==0) break;
			b=new BLOK[n];
			b[0]=new BLOK();
			for(i=1;i<n;i++){
				k=sc.nextInt();
				posi=sc.nextInt();
				b[i]=new BLOK();
				if(posi==0){
					b[i].left=b[k].left+1;
					b[i].down=b[k].down;
					b[i].right=b[k].right;
					b[i].up=b[k].up;
				}
				if(posi==1){
					b[i].left=b[k].left;
					b[i].down=b[k].down+1;
					b[i].right=b[k].right;
					b[i].up=b[k].up;
				}
				if(posi==2){
					b[i].left=b[k].left;
					b[i].down=b[k].down;
					b[i].right=b[k].right+1;
					b[i].up=b[k].up;
				}
				if(posi==3){
					b[i].left=b[k].left;
					b[i].down=b[k].down;
					b[i].right=b[k].right;
					b[i].up=b[k].up+1;
				}
			}
			answer();
		}
	}
	static void answer(){
		int i;
		int l,d,r,u;
		l=d=r=u=0;
		for(i=0;i<n;i++){
			if(l<b[i].left-b[i].right){
				l=b[i].left-b[i].right;
			}
			if(r<b[i].right-b[i].left){
				r=b[i].right-b[i].left;
			}
			if(u<b[i].up-b[i].down){
				u=b[i].up-b[i].down;
			}
			if(d<b[i].down-b[i].up){
				d=b[i].down-b[i].up;
			}
		}
		System.out.println((l+r+1)+" "+(u+d+1));
	}
}