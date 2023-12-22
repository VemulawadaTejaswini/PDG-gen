import java.util.*;
import java.lang.*;
public class Main {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            boolean path=false;
            for (int i=0;i<input.length()-1;i++){
                if(input.charAt(i)!=input.charAt(i+1)){
                    path=true;
                    break;
                }
            }
            System.out.println(path ? "Yes":"No");
    }
}



