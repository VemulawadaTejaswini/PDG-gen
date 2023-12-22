import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, num;
		String e; 
		boolean[][] c = new boolean[4][13];
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0; i<n; i++){
			e=sc.next();
			num=sc.nextInt();
			if(e.equals("S")) c[0][num-1]=true;
			else if(e.equals("H")) c[1][num-1]=true;
			else if(e.equals("C")) c[2][num-1]=true;
			else if(e.equals("D")) c[3][num-1]=true;
		}
		for(int i=0; i<4; i++){
			for(int j=0; j<13; j++){
				if(c[i][j]!=true) {
					if(i==0) System.out.println("S "+ (j+1));
					else if(i==1) System.out.println("H "+ (j+1));
					else if(i==2) System.out.println("C "+ (j+1));
					else if(i==3) System.out.println("D "+ (j+1));
				}
			}
		}
	}
}