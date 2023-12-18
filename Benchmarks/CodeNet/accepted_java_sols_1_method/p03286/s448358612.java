import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//C
		int N = sc.nextInt();
		if(N == 0)
			System.out.println("0");
		else{
			StringBuilder ans = new StringBuilder();
			long div = 1;
			while(N != 0){
				//System.out.println(N+"::"+ans+"::"+N%(div*2));
				if(N % (div * 2) == 0){
					ans.append(0);
				}else{
					ans.append(1);
					N -= div;
				}
				div *= -2;
			}
			System.out.println(ans.reverse());
		}
	}
}