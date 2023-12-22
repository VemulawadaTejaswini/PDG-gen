import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String first = scanner.next();
      	String second = scanner.next();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < length; i++){
        	builder.append(first.charAt(i));
            builder.append(second.charAt(i));
        }
        System.out.println(builder.toString());
    }
}