import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        if(n%10==2 ||n%10==4 || n%10==5 || n%10==7 || n%10==9) System.out.println("hon");
        else if(n%10==0 ||n%10==1 || n%10==6 || n%10==8) System.out.println("pon");
        else System.out.println("bon");
    }
}