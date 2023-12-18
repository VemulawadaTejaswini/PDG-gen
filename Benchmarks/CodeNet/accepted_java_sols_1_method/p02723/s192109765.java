import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 

        
        String s = stdIn.next();
        char c[] = s.toCharArray();
        //int c = stdIn.nextInt();
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
        
        if(c[2] == c[3] && c[4] == c[5]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}
