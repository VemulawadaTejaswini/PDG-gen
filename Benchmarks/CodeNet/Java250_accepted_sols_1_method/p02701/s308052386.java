import java.util.Scanner;
import java.util.Set;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Set<String> hash_set = new HashSet<String>();
        
        
        String s = scan.nextLine();


        for (int i = 0; i < n; i++) {
            hash_set.add(scan.nextLine());   
        }


        System.out.println(hash_set.size());
 
        scan.close();
    }
}
