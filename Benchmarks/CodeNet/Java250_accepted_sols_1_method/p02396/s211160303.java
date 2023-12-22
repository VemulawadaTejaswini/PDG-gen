import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=s.nextInt();
		int n=1;
		while(i!=0){
			System.out.println("Case "+n+": "+i);
			n++;
			i=s.nextInt();
			continue;
		}
	}
}