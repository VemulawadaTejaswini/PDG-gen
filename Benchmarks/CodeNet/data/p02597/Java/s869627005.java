import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] chars = new char[n];
        String str = sc.nextLine();
        for (int i = 0 ; i < n ; i++){
            chars[i] = str.charAt(i);
        }
        int count = 0;
        int backIndex = n - 1;
        for (int i = 0 ; i < n ; i++){
            if (chars[i] == 'W'){
                for (int j = backIndex; j > i ; j--){
                    if (chars[j] == 'R'){
                        chars[j] = 'W';
                        chars[i] = 'R';
                        backIndex = j;
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
