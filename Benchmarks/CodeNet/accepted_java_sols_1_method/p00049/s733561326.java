import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		String str="";
		String[] kojin;
		int[] bt=new int[4];		//A B AB O

		for(int i=0; i<3; i++) {
			bt[i]=0;
		}

	sc=new Scanner(System.in);
		while(sc.hasNext()) {
			str=sc.next();
			kojin=str.split(",");

			if(kojin[1].equals("A")) {
				bt[0]++;
			}
			else if(kojin[1].equals("B")) {
				bt[1]++;
			}
			else if(kojin[1].equals("AB")) {
				bt[2]++;
			}
			else if(kojin[1].equals("O")) {
				bt[3]++;
			}
		}

		for(int i=0; i<4; i++) {
			System.out.println(bt[i]);
		}
		sc.close();
	}
}
