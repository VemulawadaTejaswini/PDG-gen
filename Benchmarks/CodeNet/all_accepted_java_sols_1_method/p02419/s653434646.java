
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String word;
        Scanner sc =new Scanner(System.in);
        String key = sc.next();
        String end = "END_OF_TEXT";

        int n;
        int m;
        int count=0;
        while(true){

            word=sc.next();
            if(end.equals(word)) {
                System.out.println(count);
                break;
            }
            else if(key.equalsIgnoreCase(word)) {
                count = count + 1;
            }
        }
    }
}
