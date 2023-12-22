import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String W = scanner.next().toLowerCase();
        String tmp;
        int count = 0;
        while(!(tmp = scanner.next()).equals("END_OF_TEXT")){
            if(tmp.equalsIgnoreCase(W)){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
