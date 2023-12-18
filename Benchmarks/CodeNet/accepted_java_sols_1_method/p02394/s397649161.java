import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt(),h=sc.nextInt(),x=sc.nextInt(),
            y=sc.nextInt(),r=sc.nextInt();
        int s=Math.min(x,w-x),t=Math.min(y,h-y);
        String a = (s>=r && t>=r) ? "Yes" : "No";
        System.out.println(a);
    }
}
