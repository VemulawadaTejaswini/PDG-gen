import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String code = sc.nextLine();
       String match = "CODEFESTIVAL2016"; 
       int result = 0;
       for(int i=0; i< code.length(); i++){
           if(code.charAt(i) != match.charAt(i)){
               result++;
           }
       }
       System.out.println(result);
    }
}
