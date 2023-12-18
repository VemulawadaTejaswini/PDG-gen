import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 1;
        
        while(input != 0) {
            System.out.println("Case " + i +": " + input);
            input = scanner.nextInt();
            i++;
        }
    }
}