import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kei = 100000;
		for(int i=1; i<=n; i++){
			kei *= 1.05;
			if(kei%1000 > 0){
				kei = ((kei - kei%1000)+ 1000);
			}
		}
		System.out.println(kei);
	}
}