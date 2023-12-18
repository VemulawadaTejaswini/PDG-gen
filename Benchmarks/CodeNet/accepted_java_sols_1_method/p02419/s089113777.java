import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String w = scan.next();

        int count = 0;

        while(true) {
            String t = scan.next();
            if(t.equals("END_OF_TEXT")) {
                break;
            }

            if(t.toLowerCase().equals(w)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
