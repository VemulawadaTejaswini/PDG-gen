import java.util.*;

class Main{
    public static void main(String[] args) {       
         Scanner stdIn = new Scanner(System.in);
         char c[] = stdIn.next().toCharArray();
         String ans = "Yes";
         for(int i = 0; i < c.length; i++){
             if(c[i] == ((i+1) % 2 == 1 ? 'L' : 'R')){
                ans = "No";
                break;
             }
         }
         System.out.println(ans);
    }
}