import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int min=0,max=0,x;long sum=0;
        for(int i=0;i<n;i++){
            if(i==0){
                x=sc.nextInt();
                min=x;max=x;sum+=x;continue;
            }
            x=sc.nextInt();
            max=Math.max(max,x);
            min=Math.min(min,x);
            sum+=x;
        }
        System.out.printf("%d %d %d\n",min,max,sum);
    }
}
