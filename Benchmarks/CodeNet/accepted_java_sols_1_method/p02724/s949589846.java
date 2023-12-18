import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        long x = stdIn.nextLong();
        //int x = stdIn.nextInt();
        //boolean flag = true;
        
        // for(int i = 0; i < s.length(); i++){
        //     a[i] = c[i] - 48;
        //     System.out.println(a[i]);
        // }
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        System.out.println((x / 500 * 1000) + (x % 500 / 5 * 5));
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}
