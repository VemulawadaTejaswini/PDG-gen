import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,f,r;
        while (true) {
            m = input.nextInt();
            f = input.nextInt();
            r = input.nextInt();
            if (m == -1 && f == -1 && r == -1){
                break;
            }
            String result;
            if (m == -1 || f == -1){
                result = "F";
            } else if (m+f >= 80){
                result = "A";
            } else if (m+f >= 65){
                result = "B";
            } else if (m+f >= 50){
                result = "C";
            } else if (m+f < 30){
                result = "F";
            } else if (r >= 50){
                result = "C";
            } else {
                result = "D";
            }
            System.out.println(result);
        }
    }
}
