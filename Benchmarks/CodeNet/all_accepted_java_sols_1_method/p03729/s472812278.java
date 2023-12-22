import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] strings = str.split(" ");

        String first = strings[0];
        String second = strings[1];
        String third = strings[2];

        if(first.charAt(first.length()-1) == second.charAt(0) && second.charAt(second.length()-1) == third.charAt(0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}