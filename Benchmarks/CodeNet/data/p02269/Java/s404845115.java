
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<String> set = new HashSet<>();
        for(int i = 0;i < n;i++){
            String order = scan.next();
            String arg = scan.next();
            if(order.equals("insert"))set.add(arg);
            else{
                if(set.contains(arg))System.out.println("yes");
                else System.out.println("no");
            }
        }
        scan.close();
    }
    

}
