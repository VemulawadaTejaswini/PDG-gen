import java.util.Scanner;


class Node{
	int children;
	int brother;
	int parent;
	int deap;
	String tape;


	Node(){
		children=-1;
		brother=-1;
		parent=-1;
		deap=-1;
		tape="";
	}


}

public class Main{
	static Node[] N;

	static int Deapsif(int i) {

		int deap = 0;
		while(N[i].parent!=-1) {
			deap++;
			i=N[i].parent;
		}
		return deap;

	}

	static void Tapetest(int i) {
		if(N[i].parent==-1) {
			N[i].tape="root";
		}
		else if(N[i].children!=-1) {
			N[i].tape="internal node";
		}
		else if(N[i].children==-1){
			N[i].tape="leaf";
		}


	}

	static void Print_brother(int i) {
		int count=0;
		if(N[i].children!=-1) {
			i = N[i].children;
			while(i!=-1) {
				if(count==0) {
					System.out.print(i);
					i=N[i].brother;
				}
				else {
					System.out.print(", "+i);
					i=N[i].brother;
				}
				count=1;
			}
		}
		System.out.println("]");
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		N=new Node[n];
		for(int i=0;i<n;i++)N[i]=new Node();


		for(int i=0;i<n;i++) {
			int i1=sc.nextInt();
			int dataN = sc.nextInt();
			int l=0;
			for(int j=0;j<dataN;j++) {
				int c= sc.nextInt();
				N[c].parent=i1;
				if(j==0)N[i1].children=c;
				else N[l].brother =c;
				l=c;
			}
		}


		for(int i=0;i<n;i++)N[i].deap=Deapsif(i);
		for(int i=0;i<n;i++)Tapetest(i);

		for(int i=0;i<n;i++) {
			
			System.out.print("node "+i+": parent = "+N[i].parent+", depth = "+N[i].deap+", "+N[i].tape+", [");

			Print_brother(i);
				
				
				
		}






		sc.close();
	}
}


