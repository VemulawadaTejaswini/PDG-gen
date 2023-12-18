import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        char s = S.charAt(S.length() - 1);
        if (s == '2' || s == '4' || s == '5' || s == '7' || s == '9'){
            System.out.println("hon");
        } else if(s == '3'){
            System.out.println("bon");
        } else {
            System.out.println("pon");
        }

        scanner.close();
    }

}