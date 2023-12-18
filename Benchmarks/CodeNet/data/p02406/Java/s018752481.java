import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("3");
		for(int i=4;i<=n;i++){
			if(i%3==0||i%10==3)System.out.printf(" %d",i);
		}
		System.out.print("\n");
	}
}

