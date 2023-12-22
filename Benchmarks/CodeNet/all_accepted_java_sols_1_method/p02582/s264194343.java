import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;

        scanner.close();

        for (int i = 0; i < 3; i++){
            if (S.charAt(i) == 'R'){
                count++;
            }
        }
        if (S.equals("RSR")){
            count = 1;
        }
        
        System.out.println(count);
    }
}

