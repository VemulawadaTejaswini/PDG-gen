
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String ring = s + s;
        String check = scan.nextLine();
        if(ring.contains(check)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
