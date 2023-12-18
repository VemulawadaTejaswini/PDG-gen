import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String W = scan.next().toLowerCase();
        int count = 0;
        int sys_count = 0;

        while(true){

            sys_count++;
            String T = scan.next();
          
            if(T.equals("END_OF_TEXT")){
                break;
            }

            if(W.equals(T.toLowerCase())){
                ++count;
            }

        }
        System.out.println(count);
    }
}
