
import java.util.Scanner;
 
class Main {
    public static void main(String[] a){
        Scanner scan = new Scanner(System.in);
        int time = Integer.parseInt(scan.nextLine());
        while(time -- > 0){
            String input = scan.nextLine().replaceAll("Hoshino","Hoshina");
            System.out.println(input);
        }
    }
}