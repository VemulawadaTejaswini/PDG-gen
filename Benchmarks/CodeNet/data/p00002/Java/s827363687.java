import java.util.Scanner;
public class Main {
	public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sum = n + m;
        
        String result = Integer.toString(sum);
        
        System.out.println(result.length());
        scan.close();
	}
}