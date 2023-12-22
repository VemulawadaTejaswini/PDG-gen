import static java.lang.Math.abs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        sc.close();
        int count=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='A') count++;
            else count--;
        }
        if(abs(count)==3)System.out.println("No");
        else System.out.println("Yes");    
    }
}