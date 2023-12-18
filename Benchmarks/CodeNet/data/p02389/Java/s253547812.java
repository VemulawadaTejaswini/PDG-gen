import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        int b = scan.nextInt();
        
        int squer = a*b; 
        int sum = a*2+b*2;
        
        System.out.print(squer);
        System.out.println(" " + sum);
	}

}
