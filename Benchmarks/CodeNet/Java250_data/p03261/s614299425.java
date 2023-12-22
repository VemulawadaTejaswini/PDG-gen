import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();scan.nextLine();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = scan.nextLine();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i != j && str[i].equals(str[j])) {
                    System.out.println("No");
                    return;
                }
            }
        }
        for(int i = 0; i < n-1; i++) {
            if (str[i].charAt(str[i].length()-1) != str[i+1].charAt(0)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}