import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i=3; i<=n; i++){
			a=i;
			for(;;){
				if(i%3==0 || a%10==3){
				System.out.print(" " + i);
				break;
				}
				if(a<10)break;
				a=a/10;
			}
		}
		System.out.println();
	}
}