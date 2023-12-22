import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int numR = 0;
        int maxR = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'R'){
                numR++;
            } else {
                numR = 0;
            }

            if (numR >= maxR){
                maxR = numR;
            }
        }
        System.out.println(maxR);
    }
}