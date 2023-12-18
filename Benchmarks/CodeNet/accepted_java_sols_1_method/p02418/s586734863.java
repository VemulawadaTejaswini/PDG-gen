
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String p = sc.next();
        sc.close();
        if(s.length()<p.length()){
            System.out.println("No");
        }else{
            s = s + s;
            if(s.contains(p)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
