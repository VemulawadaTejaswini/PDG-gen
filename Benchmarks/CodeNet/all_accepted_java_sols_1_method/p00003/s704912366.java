import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i = 0; i < T; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();

            if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		}
	}
}