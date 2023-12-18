import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;
        int max = 0;
        int tmp = 0;

        scanner.close();

        for (int i = 0; i < S.length() - 1; i++){
            if (S.charAt(i) == S.charAt(i + 1)){
                count++;
            } else {
                tmp = count + 1;
                count = 0;
                if (max < tmp){
                    max = tmp;
                }
            }
        }
        
        System.out.println(max);
    }
}

