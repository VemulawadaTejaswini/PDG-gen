import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name[]=new String[9];
		int n[]=new int[9];
		int c[]=new int[9];
		for(int i=0;i<9;i++){
			name[i]=sc.next();
			int temp1=sc.nextInt();
			int temp2=sc.nextInt();
			n[i]=temp1+temp2;
			c[i]=temp1*200+temp2*300;
		}
		for(int i=0;i<9;i++){
			System.out.println(name[i]+" "+n[i]+" "+c[i]);
		}
	}
}