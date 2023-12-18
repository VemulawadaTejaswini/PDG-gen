import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ans = "";
		int a, b;
		while(scan.hasNext()){
			//scan.useDelimiter(" |\n");
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());
			if(a == 0 && b == 0){
				break;
			}else if(a < b){
				ans = a + " " + b;
			}else if(b < a){
				ans = b + " " + a;
			}else if(a == b){
				ans = a + " " + b;
			}
			System.out.println(ans);

		}
	}
}