import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
 
        for(int loopcnt = str.length; loopcnt > 0; loopcnt--){
            if( loopcnt != 1 ) System.out.print(str[loopcnt-1] + " ");
            else System.out.print(str[loopcnt-1]);
        }
        System.out.println();
    }
}