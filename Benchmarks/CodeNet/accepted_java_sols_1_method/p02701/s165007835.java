import java.math.*;
import java.util.*;


public class Main {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        HashSet<String> items =new HashSet<String>();
        int N =scan.nextInt();
        int i=0;
        while(N-->0) {
            String s=scan.next();
        if(items.contains(s)){
            continue;
        }
        else {
            items.add(s);
            i++;
        }
        }
        System.out.println(i);
    }

}
