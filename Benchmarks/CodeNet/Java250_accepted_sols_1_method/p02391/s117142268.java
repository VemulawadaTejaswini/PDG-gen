import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a;
		int b = 0;
		Scanner data1 = new Scanner(System.in);
	    a = data1.nextInt();
	    b = data1.nextInt();
		if(a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}
	}

}