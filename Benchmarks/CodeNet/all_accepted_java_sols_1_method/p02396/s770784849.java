import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i=1;
        while(true){
        n=sc.nextInt();
        if(n==0) break;
        System.out.printf("Case %d: %d\n",i,n);
        i++;
        }
    }
}
