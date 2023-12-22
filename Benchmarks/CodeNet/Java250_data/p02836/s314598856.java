import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                int counter = 0;
                for(int i =0; i < str.length() / 2; i ++){
                    if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                        counter++;
                    }
                }
                System.out.println(counter);
    }
}
