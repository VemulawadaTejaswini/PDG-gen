import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		for(int q=0;;q++){
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == 0&&b == 0){
			System.exit(0);
		}
		
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
		System.out.printf("#");
		if(j+1==b){
			System.out.printf("\n");
		}
		}
	}
		}
}
}