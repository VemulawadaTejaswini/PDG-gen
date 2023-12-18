import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[]=new int[5];
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
			if(num[i]==0)
				System.out.println(i+1);
		}
		sc.close();
	}
}
