import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        String s = sc.next();
        String t = sc.next();

         for(int i = 0; i < 3; ++i){
            if(s.charAt(i) == t.charAt(i)) ++counter;     
         }
        
         System.out.println(counter);
    }
}