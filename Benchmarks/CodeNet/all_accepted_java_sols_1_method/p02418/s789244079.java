import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String ss=s+s;
        String p=sc.next();
        
        if (ss.contains(p)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
