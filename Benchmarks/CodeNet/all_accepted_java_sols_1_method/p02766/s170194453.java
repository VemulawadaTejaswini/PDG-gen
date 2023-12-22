import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        // int c = stdIn.nextInt();
        // String s = stdIn.next();
        // boolean flag = true;
        
        int count = 0;
        
        while(true){
            if(n == 0){
                break;
            }else{
                n /= k;
                count++;
            }
        }
        
        System.out.println(count);
        
        // int num[] = new int[n];
        
        // for(int i = 0; i < n; i++){
        //     num[i] = stdIn.nextInt();
        // }
        
        // char c[] = s.toCharArray();
        
        // for(int i = 0; i < s.length(); i++){
        //     c[i];
        // }
        
        // if(flag){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
        // System.out.println();
        // System.out.print();
    }
}