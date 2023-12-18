import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;
        int max = 0;

        scanner.close();

        for (int i = 0; i < S.length() - 1; i++){
            if (S.charAt(i) == 'R'){
                count++;
            } else {
                if (count > max){
                    max = count;
                }
                count = 0;
            }
        }
        
        System.out.println(max);
    }
}

