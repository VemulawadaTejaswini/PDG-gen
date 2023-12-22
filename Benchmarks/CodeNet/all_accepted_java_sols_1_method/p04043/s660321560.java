import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s=1;
        for(int i=0;i<3;i++)
            s*=sc.nextInt();
        if(s==175)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}