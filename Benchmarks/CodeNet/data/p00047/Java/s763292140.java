import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		String str="";
		String[] kuwasiku;
		int[] hako=new int[3];
		int afrom=0,ato=0;
		int tmp1=0,tmp2=0;

		for(int i=0; i<3; i++) {
			hako[i]=0;
		}
		hako[0]=1;

	sc=new Scanner(System.in);
		while(sc.hasNext()) {
			str=sc.next();
			kuwasiku=str.split(",");
			if(kuwasiku[0].equals("A")) {
				afrom=0;
			}
			else if(kuwasiku[0].equals("B")) {
				afrom=1;
			}
			else if(kuwasiku[0].equals("C")) {
				afrom=2;
			}

			if(kuwasiku[1].equals("A")) {
				ato=0;
			}
			else if(kuwasiku[1].equals("B")) {
				ato=1;
			}
			else if(kuwasiku[1].equals("C")) {
				ato=2;
			}

			tmp1=hako[afrom];
			tmp2=hako[ato];
			hako[afrom]=tmp2;
			hako[ato]=tmp1;
		}
		if(hako[0]==1) {
			System.out.println("A");
		}
		else if(hako[1]==1) {
			System.out.println("B");
		}
		else if(hako[2]==1) {
			System.out.println("C");
		}
	}
}
