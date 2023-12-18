import java.util.Scanner;
import java.util.*;

class Main implements Comparable{
    public int id,res;
    Main(){id=0;res=0;}
    Main(int i){id = i;res= 0;}
    public int compareTo(Object a){
	if (this.res !=  ((Main)a).res)return this.res-((Main)a).res;
	return this.id - ((Main)a).id;
    }

    public static void main(String args[]){
	int n;
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	Main all[] = new Main[n];
	for(int i=0;i<n;i++){
	    all[i] = new Main(i+1);
	}

	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
		int a,b,c,d;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		a--;
		b--;

		int[] p = {0,0};
		if (c > d)p[0]=3;
		else if (c == d){
		    p[0]=1;
		    p[1] = 1;
		}else p[1] = 3;
		
		//System.out.println(a + " " + b + " " + p[0] + " " + p[1]);
		all[a].res += p[0];
		all[b].res += p[1];
	    }
	}
	//for(int i=0;i<n;i++)System.out.println(all[i].id + " " + all[i].res);
	for(int i=0;i<n;i++){
	    int cnt = 0;
	    for(int j=0;j<n;j++){
		if (all[i].res < all[j].res)cnt++;
	    }
	    System.out.println(cnt+1);
	}
	
    }
}