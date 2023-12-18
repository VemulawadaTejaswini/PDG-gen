import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
        char sArr[] = s.toCharArray();
        for(int i = 0; i < 3; i++){
            System.out.print(sArr[i]); 
        }
        System.out.println();
    }
}