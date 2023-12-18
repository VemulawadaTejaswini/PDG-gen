import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ringStrs = scan.nextLine().split("");
        String[] Strs = scan.nextLine().split("");
        int count = 0;
        for (String ringStr : ringStrs) {
            if (ringStr.equals(Strs[count])) {
                count++;
            }
            if (count >= Strs.length) {
                break;                                                 
            }
        }
        if (count == Strs.length) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }   
}