import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		for(int i = 0; i < N; i++){
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			if((c*c)==(a*a)+(b*b)){
				System.out.println("YES");
			} else{System.out.println("NO");}
		}
	}
}