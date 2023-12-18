import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int mid = input.nextInt();
            int last = input.nextInt();
            int makeUp = input.nextInt();
            int tot = mid + last;
            if ( mid == -1 && last == -1 && makeUp == -1){
                break;
            }
            if (mid == -1 || last == -1) {
                System.out.println("F");
            }else if (tot >= 80) {
                System.out.println("A");
            } else if (tot >= 65) {
                System.out.println("B");
            } else if (tot >= 50) {
                System.out.println("C");
            } else if (tot >= 30) {
                String res = makeUp >= 50 ? "C" : "D";
                System.out.println(res);
            } else {
                System.out.println("F");
            }
        }
    }
}
