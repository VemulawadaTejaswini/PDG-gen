import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            hs.add(sc.next());
        }
        System.out.println(hs.size());
    }
}