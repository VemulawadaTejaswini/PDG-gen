import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String target = a + b;
        String result = "No";

        for(int i = 1; i < 100100; i++){
            String squareNumbers = Integer.toString(i*i);

            if(squareNumbers.equals(target)){
                result = "Yes";
                break;
            }
        }

        System.out.println(result);
    }
}
