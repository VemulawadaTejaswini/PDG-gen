import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        // String s = stdIn.next();
        boolean flag = true;
         
        if(a == b && b == c){
            flag = false;
        } 
        
        if(a != b && a != c && b != c){
            flag = false;
        }
        
        // int num[] = new int[n];
        
        // for(int i = 0; i < n; i++){
        //     num[i] = stdIn.nextInt();
        // }
        
        // char c[] = s.toCharArray();
        
        // for(int i = 0; i < s.length(); i++){
        //     c[i];
        // }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        // System.out.println();
        // System.out.print();
    }
}
