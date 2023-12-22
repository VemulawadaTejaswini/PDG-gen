import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = sc.next();

       if(op.equals("a")|op.equals("i")|op.equals("u")|op.equals("e")|op.equals("o")){
         System.out.print("vowel");
       }else{
         System.out.print("consonant");
       }
      
    }
}