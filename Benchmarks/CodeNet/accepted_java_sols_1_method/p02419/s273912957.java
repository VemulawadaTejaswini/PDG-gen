
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        w = w.toLowerCase();
        boolean flag = true;
        int count = 0;
        while(flag){
            String t = sc.next();
            if(t.contains("END_OF_TEXT")){
                flag = false;
            }else{
                t = t.toLowerCase();
                if(t.equals(w)){
                    count = count + 1;
                }
            }
        }
        sc.close();
        System.out.println(count);
    }
}
