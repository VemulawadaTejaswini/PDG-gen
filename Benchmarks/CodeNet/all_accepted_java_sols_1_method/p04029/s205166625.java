import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        int n2=0;
        for (int i=1;i<=n;i++){
            n2=n2+i;
        }
        System.out.println(n2);
    }
}