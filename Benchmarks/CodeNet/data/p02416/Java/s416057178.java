import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		    String str = sc.nextLine();
		    if ("0".equals(str)) {
		        break;
		    }
		    int sum = 0;
		    for (int i = 0; i < str.length(); i++) {
		        sum += str.charAt(i) - '0';
		        //System.out.println(str.charAt(i));
		        //System.out.println("数値は" + sum);
		    }
		    System.out.println(sum);
		}
		
    }
}
