import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String ans = "Yes";
        if(a == b){
            if(b == c){
                ans = "No"; 
         }   
        }else if(b != c){
            if(a == c){
                ans = "Yes";
            }else{
                ans = "No"; 
            }
        }
        System.out.println(ans);
    }
}
