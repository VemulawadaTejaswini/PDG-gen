import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String Comparisonn;
		if(a>b){
		     Comparisonn = ">";
		}else if(a<b){
		     Comparisonn = "<";
		}else{
		     Comparisonn = "==";
		}
		
		System.out.printf("a %s b\n", Comparisonn);
	}
}	

