import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        //int n = stdIn.nextInt();
        String s = stdIn.next();
        String ss = stdIn.next();
        
        char c[] = s.toCharArray();
        char cc[] = ss.toCharArray();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(c[i] != cc[i]){
                count++;
            }
        }
        //boolean flag = false;
        //int a[] = new int[n];
        
        //for(int i = 0; i < n; i++){
        //    a[i] = stdIn.nextInt();
        //}
        
        //if(flag){
            System.out.println(count);
        //}else{
        //    System.out.println();
        //}
    }
}
