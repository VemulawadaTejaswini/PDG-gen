import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line = sc.next();

        int r = 0;
        int b = 0;
        for (int i = 0;i < n;i++){
            if(line.charAt(i) == 'R'){
                r++;
            } else {
                b++;
            }
        }

        if(r > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
