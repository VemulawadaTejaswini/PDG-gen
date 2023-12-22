import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strArr[] = str.split(" ");
        
        int x = 0;
        int y = 0;
        int tmp_x = Integer.parseInt(strArr[0]);
        int tmp_y = Integer.parseInt(strArr[1]);
        
        if (tmp_x > tmp_y) {
            y = tmp_x;
            x = tmp_y;
        } else {
            x = tmp_x;
            y = tmp_y;
        }
        
        while(y > 0){
            int r = x % y;
            x = y;
            y = r;
        }

        System.out.println(x);
    }
}
