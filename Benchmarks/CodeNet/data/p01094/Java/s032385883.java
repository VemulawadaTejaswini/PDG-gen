import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int n=in.nextInt();
			if(n==0)break;
			
			String data[]=new String[n];
			for(int i=0;i<n;i++)data[i]=in.next();
			
			people vote[]=new people[26];
			for(int i=0;i<26;i++) {
				vote[i]=new people((char)(i+65),0);
			}
			
			int i;people winner=new people('0',0);
			for(i=0;i<n;i++) {
				char v=data[i].charAt(0);
				vote[v-65].v++;
				people w[]=findWinner(vote);
				//System.out.printf("%d winner=%c, %d,w2=%d %d\n",i,w[0].name,w[0].v,w[1].v,w[1].v+n-i-1);
				if(w[0].v>w[1].v+(n-i-1)) {
					winner=w[0];
					break;
				}
			}
			
			if(winner.name!='0')System.out.println(winner.name+" "+(i+1));
			else System.out.println("TIE");
		}
	}
	
	static people[] findWinner(people[] list) {
		char name=list[0].name; int max=list[0].v, p=0;
		for(int i=1;i<26;i++) {
			if(list[i].v>max) {
				max=list[i].v;
				name=list[i].name;
				p=i;
			}
		}
		people w[]=new people[2];
		w[0]=new people(name,max);
		name=0;max=0;
		
		for(int i=0;i<26;i++) {
			if(i==p)continue;
			if(list[i].v>=max) {
				max=list[i].v;
				name=list[i].name;
			}
		}
		
		w[1]=new people(name,max);
		return w;
	}

}

class people{
	char name; int v=0;
	people(char n,int m){
		name=n; v=m; 
	}
}


