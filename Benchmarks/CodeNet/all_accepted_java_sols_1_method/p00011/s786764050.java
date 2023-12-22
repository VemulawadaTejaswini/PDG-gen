import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int stick = sc.nextInt();
        int bar = sc.nextInt();

        int[] amida = new int[stick];

        for(int i = 0; i < stick; i++){
            amida[i] = i;
        }

        for(int i = 0; i < bar; i++){
            String line = sc.next();

            int a = 0;
            int b = 0;

            int index = 0;
            for(; index < line.length(); index++){
                if(line.charAt(index) == ','){
                    index++;
                    break;
                }else{
                    a *= 10;
                    a += Integer.parseInt("" + line.charAt(index));
                }
            }

            for(; index < line.length(); index++){
                b *= 10;
                b += Integer.parseInt("" + line.charAt(index));
            }

            a--;
            b--;

            int c = amida[a];
            int d = amida[b];

            amida[a] = d;
            amida[b] = c;
        }

        for(int i = 0; i < stick; i++){
            System.out.println(amida[i]+1);
        }
 
    }
}