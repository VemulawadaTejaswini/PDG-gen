import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k=-(scan.nextInt());
		int x=scan.nextInt();
		for(int i=k+1;i<-k;i++){
			System.out.println(x+i);
		}
	}
}
