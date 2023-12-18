import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			Card[] p=new Card[N];
			Card[] q=new Card[N];
			Card[] r=new Card[N];
			
			for(int i=0;i<N;i++) {
				String s=new String(sc.next());
				p[i] = new Card(s);
				q[i] = new Card(s);
				r[i] = new Card(s);
			}
			
			//Bubble sort
			for(int i=0;i<N;i++){
				for(int j=N-1;j>i;j--){
					if(q[j].compareTo(q[j-1])<0){
						Card tmp=q[j];
						q[j]=q[j-1];
						q[j-1]=tmp;
					}
				}
			}
			
			//Colleciton sort
			for(int i=0;i<N;i++){
				int minj=i;
				for(int j=i;j<N;j++){
					if(r[j].compareTo(r[minj])<0){
						minj=j;
					}
				}
				Card tmp=r[i];
				r[i]=r[minj];
				r[minj]=tmp;
			}
			
			boolean BC=isStable(p,q);
			boolean SC=isStable(p,r);
			
			
			
			System.out.print(q[0]);
			for(int i=1;i<N;i++)System.out.print(" "+q[i]);
			System.out.println();
			System.out.println(BC?"Stable":"Not stable");
			System.out.print(r[0]);
			for(int i=1;i<N;i++)System.out.print(" "+r[i]);
			System.out.println();
			System.out.println(SC?"Stable":"Not stable");
		}
	}
	
	
	public static boolean isStable(Card[] c1, Card[] c2){
		final int kind=13;
		boolean isStable=true;
		int N=c1.length;
		StringBuilder[] suit1 =new StringBuilder[kind];
		StringBuilder[] suit2 =new StringBuilder[kind];
		for(int i=0;i<kind;i++){
			suit1[i]= new StringBuilder();
			suit2[i]= new StringBuilder();
		}
		for(int i=0;i<N;i++){
			suit1[c1[i].n-1].append(c1[i].toString());
			suit2[c2[i].n-1].append(c2[i].toString());
		}
		for(int i=0;i<kind;i++){
			if(!suit1[i].toString().isEmpty()){
				isStable=isStable&&(suit1[i].toString().equals(suit2[i].toString()));
			}
		}
		return isStable;
	}
}



class Card implements Comparable<Card>{
	String s;
	int n;
	public String toString(){
		return s;
	}
	Card(String s){
		this.s=s;
		this.n=Integer.parseInt(s.substring(1));
	}
	public int getNumber(){
		return this.n;
	}
	public int compareTo(Card c){
		return this.n-c.n;
	}
	
}