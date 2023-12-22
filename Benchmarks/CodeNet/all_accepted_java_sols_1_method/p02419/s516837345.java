
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        String w= scanner.next();
        long result=0;
        while(true){
            String t=scanner.next();
            if(t.equals("END_OF_TEXT")) break;
            t=t.toLowerCase();
            if(t.equals(w)) result++;

        }
        System.out.println(result);

    }

}

