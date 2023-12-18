import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans = scan.nextLine();
        String[] words = scan.nextLine().split(" ");
        int count = 0;
        while(!words[0].equals("END_OF_TEXT")) {
            for (String word : words) {
                if (word.equals(ans)) {
                    count++;
                }
            }
            words = scan.nextLine().split(" ");                                 
        }
        out.println(count);
    }   
}