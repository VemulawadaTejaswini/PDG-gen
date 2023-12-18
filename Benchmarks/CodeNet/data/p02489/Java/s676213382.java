import java.util.*;
public class Main {
    static void main(String[] args) {
        static Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while(n != 0){
            System.out.println("Case " + i + ": " + n);
            n = input.nextInt();
            i++;
        }
}
}