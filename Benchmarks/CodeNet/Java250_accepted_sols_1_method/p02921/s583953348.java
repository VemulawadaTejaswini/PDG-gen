import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        char[] t = scanner.nextLine().toCharArray();
        int count = 0;
        for(int i=0; i <=2 ; i++) {
            if(s[i]==t[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
