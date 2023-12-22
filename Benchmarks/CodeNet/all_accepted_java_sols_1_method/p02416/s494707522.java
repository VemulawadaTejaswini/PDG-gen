
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            String numStr = sc.next();
            if (numStr.equals("0"))
                break;
            int sum = 0;
            for (int i = 0; i < numStr.length(); i++){
                 sum += Integer.parseInt(numStr.substring(i, i + 1));
            }
            System.out.println(sum);
        }
    }
}

