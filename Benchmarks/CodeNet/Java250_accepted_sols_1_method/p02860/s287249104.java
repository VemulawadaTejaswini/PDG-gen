import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = sc.next();
        
        if(x%2==1){
            System.out.println("No");
            return;
        }
        
        String pre = s.substring(0, s.length()/2);
        String aft = s.substring(s.length()/2);
        if(pre.equals(aft)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}