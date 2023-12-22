import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         
        int m = stdIn.nextInt();
        for(int i=0;i<m;i++){
            Set<String> set = new HashSet<String>();
            String input = stdIn.next();
            set.add(input);
            for(int j=1;j<input.length();j++){
                String catBefore = input.substring(0, j);
                String catAfter = input.substring(j);
                String beforeBufferBuffer = new StringBuffer(catBefore).reverse().toString();
                String afterBuffer = new StringBuffer(catAfter).reverse().toString();
                set.add(catBefore.concat(catAfter));
                set.add(catBefore.concat(afterBuffer));
                set.add(catAfter.concat(catBefore));
                set.add(catAfter.concat(beforeBufferBuffer));
                set.add(beforeBufferBuffer.concat(afterBuffer));
                set.add(afterBuffer.concat(catBefore));
                set.add(beforeBufferBuffer.concat(catAfter));
            }
            System.out.println(set.size());
        }
    }
}