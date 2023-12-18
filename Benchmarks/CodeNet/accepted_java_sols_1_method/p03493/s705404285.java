import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int result = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '1'){
                result++;
            }
        }

        System.out.println(result);
    }
}
