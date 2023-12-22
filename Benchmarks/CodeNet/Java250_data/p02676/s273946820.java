import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();

        if(n >= S.length()){
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, n)+"...");
        }

        scanner.close();
    }

}
