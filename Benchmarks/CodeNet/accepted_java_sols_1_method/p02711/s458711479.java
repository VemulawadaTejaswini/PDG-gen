import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();

        for(int i=0;i<3;i++){
            if(c[i] == '7'){
                System.out.print("Yes");
                System.out.flush();
                return;
            }
        }
        System.out.print("No");
        System.out.flush();
    }
}