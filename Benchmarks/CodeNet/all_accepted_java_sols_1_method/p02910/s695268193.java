import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        char[] directions = s.toCharArray();
        boolean flag = true;

        for(int i = 0; i < directions.length; i++){
            if((i+1) % 2 == 0) {
                if(directions[i] == 'R') flag = false;
            } else {
                if(directions[i] == 'L') flag = false;
            }
        }

        System.out.println(flag ? "Yes" : "No");
    }
}
