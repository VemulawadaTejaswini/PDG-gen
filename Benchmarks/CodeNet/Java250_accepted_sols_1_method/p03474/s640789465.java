import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        sc.close();
        
        for(int i=0; i<s.length();i++){
            if((i < a || i > a) && (s.charAt(i) < '0' || s.charAt(i) > '9') ){
                System.out.print("No");
                return;
            }
            if(i == a && s.charAt(i) != '-'){
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");
	}
}