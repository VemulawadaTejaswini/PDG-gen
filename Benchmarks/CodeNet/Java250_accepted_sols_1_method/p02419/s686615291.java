import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        String T;
        
        int cnt = 0;
        
        while(true) {
        	T = sc.next();
        	if(T.equals("END_OF_TEXT")) break;
        	
        	T = T.toLowerCase();
        	if(W.equals(T)) cnt++;
        	
        }
        
        System.out.println(cnt);
        
    }
}
