import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int n = sc.nextInt();
        
        System.out.print(str.charAt(0));
        for(int i=n; i<str.length(); i++){
            if(i%n==0)
            System.out.print(str.charAt(i));
        }
	}
}
