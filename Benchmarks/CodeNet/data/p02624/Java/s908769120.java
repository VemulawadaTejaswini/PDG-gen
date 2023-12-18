import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tmp=0;
        int sum;
        for(int i=1;i<=n;i++){
            sum=0;
            for(int s=1;s<=i/2;s++){
                if(i%s==0){
                    sum++;
                }
            }
            tmp+=i*sum;
        }
        System.out.println(tmp);
    }
}