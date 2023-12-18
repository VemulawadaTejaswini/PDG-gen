import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int N = Integer.parseInt(scan.next());
        String[] wordArray = new String[N];


        for(int i = 0; i < N; i++){
            wordArray[i] = scan.next();
        }


        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if( (i != j) && wordArray[i].equals(wordArray[j])){
                    System.out.println("No");
                    return;
                }
            }
        }

        String end;
        String top;
        String a;


        for(int i = 0; i < N -1; i++){


            end = wordArray[i].substring(wordArray[i].length()-1);
            top = wordArray[i+1].substring(0,1);

            if(end.equals(top) == false) {
                System.out.println("No");
                return;
            }





        }

        System.out.println("Yes");
    }
}