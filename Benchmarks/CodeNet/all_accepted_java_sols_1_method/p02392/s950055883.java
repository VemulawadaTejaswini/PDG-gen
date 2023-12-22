import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        String s = (a<b && b<c) ? "Yes":"No";
        System.out.println(s);
    }
}

