import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //char s[] = new char[3];
        String input = scanner.nextLine();
        int count=0;
        for (int i = 0; i < 3; i++) {
            //s[i]=input.charAt(i);
            if(input.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
}