import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = stdIn.next();
        }

        Arrays.sort(s);

        String prev = s[0];
        int counter = 1;
        for(int i=1; i<n; i++){
            if(!s[i].equals(prev)){
                counter++;
            }
            prev = s[i];
        }

        System.out.println(counter);
    }
}