import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for(int i = a; i < a+k; i++){
            hs.add(i);
            if(i == b) break;
        }
        for(int i = b; i > b-k; i--){
            hs.add(i);
            if(i == a) break;
        }
        List<Integer> sl = new ArrayList<>(hs);
        Collections.sort(sl);
        for(int s : sl){
            System.out.println(s);
        }
    }
}