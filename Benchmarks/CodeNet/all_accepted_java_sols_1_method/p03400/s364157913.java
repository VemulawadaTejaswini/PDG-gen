import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choco =0;
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc. nextInt();
		for(int i = 0;i<N;i++){
			int A = sc.nextInt();
			for(int j =0;j<200;j++){
				if(1+A*j<=D){
					choco++;
				}else{
					break;
				}
			}
		}
		System.out.println(choco+X);
 		sc.close();
	}
}
