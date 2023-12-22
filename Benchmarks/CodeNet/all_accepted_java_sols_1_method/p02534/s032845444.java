
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t>0){
            t--;
            sb.append("ACL");
        }
        System.out.println(sb);
    }
}
