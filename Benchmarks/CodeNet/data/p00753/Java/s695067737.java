import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] s = new double[1000000];
        s[1] = 1;
        for(int i=2;i<=123456;i++){
            for(int j=2;j<=123456;j++){
                if(i*j>250000)break;
                s[i*j]++;
            }
        }

        int count = 0;
        while(true){
            count = 0;
            int n = sc.nextInt();
            if(n==0)break;
            for(int i=n+1;i<=2*n;i++){
                if(s[i] == 0){
                    count++;
                }
            }
            System.out.println(count);
            
        }
    }

}
