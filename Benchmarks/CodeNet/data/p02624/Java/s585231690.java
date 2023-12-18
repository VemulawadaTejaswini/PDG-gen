import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tmp=0;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++)if(i%s==0)tmp+=i;
        }
        System.out.println(tmp);
    }
}