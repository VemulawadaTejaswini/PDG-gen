import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int sum=0;
            double m=0.0,a2=0.0,a1=0.0;
            int n = sc.nextInt();
            int s[] = new int[n];

            if(n==0){
                break;
            }else{
                for(int i=0;i<n;i++){
                    s[i] = sc.nextInt();
                    sum += s[i];
                }

                m = (double)sum/n;
                
                for(int i=0;i<n;i++){
                    a1 += (double)(s[i]-m)*(s[i]-m);
                }
                a2 = a1/n;

                System.out.println(Math.sqrt(a2));
            }
        }

        sc.close();
    }
}
