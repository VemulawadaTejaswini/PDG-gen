import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        if(T.length()-1!=S.length()){
            System.out.print("No");
        }
        else {
            if(S.equals(T.substring(0,S.length()))){
                System.out.print("Yes");
            }
            else {
                System.out.print("No");
            }
        }
    }
}
