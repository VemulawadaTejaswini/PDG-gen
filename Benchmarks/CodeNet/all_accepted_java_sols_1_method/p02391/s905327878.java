import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        String op;
        a = input.nextInt();
        b = input.nextInt();
        if (a < b){
            op = "<";
        } else if (a > b){
            op = ">";
        } else {
            op = "==";
        }
        System.out.printf("a %s b\n",op);
    }
}
