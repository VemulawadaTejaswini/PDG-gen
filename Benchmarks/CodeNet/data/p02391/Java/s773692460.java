import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = new String();
		if(a<b) {
			s="<";
		}else if(a>b){
			s=">";
		}else {
			s="==";
		}
		System.out.println("a "+s+" b");
	}
}