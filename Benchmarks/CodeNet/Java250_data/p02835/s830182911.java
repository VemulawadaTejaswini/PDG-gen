import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if(a+b+c<=21) {
			System.out.print("win");
		}
		else if(a+b+c>21) {
			System.out.print("bust");
		}
    }
}