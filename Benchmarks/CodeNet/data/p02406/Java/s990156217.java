import java.util.Scanner;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        int target = Integer.parseInt(input);
        StringBuilder builder = new StringBuilder();
        for (int i=1; i <= target; i++) {
            int x = i;
            while (x > 0) {
                if (x % 3 == 0 && x == i){
                    builder.append(" "+i);
                    break;
                } else if (x % 10 == 3) {
                    builder.append(" " + i);
                    break;
                } else {
                    x = x / 10;
                }
            }
        }
        System.out.println(builder.toString());
    }
}
