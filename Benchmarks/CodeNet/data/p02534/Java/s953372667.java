import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int k = scan.nextInt();
    scan.close();

    StringBuilder sb = new StringBuilder();
    for(int i=0;i<k;i++) {
        sb.append("ACL");
    }
    System.out.println(sb);
}
}
