import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for (int i = 0; i < N; i++) {
			int s=sc.nextInt(),d=sc.nextInt();
			int t = s%d;
			if(t==0){
				System.out.println(d);
			}else{
				System.out.println(t);
			}
			
		}
	}
}