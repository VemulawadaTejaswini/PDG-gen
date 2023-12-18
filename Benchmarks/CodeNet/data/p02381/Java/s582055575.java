import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0,a1=0;
        double m,a2,a;

        while(true){
            int n = sc.nextInt();
            int s[] = new int[n];

            if(n==0){
                break;
            }else{
                for(int i=0;i<n;i++){
                    s[i] = sc.nextInt();
                }

                for(int i=0;i<n;i++){
                    sum += s[i];
                }
                m = sum/n;
                
                for(int i=0;i<n;i++){
                    a1 += (s[i]-m)*(s[i]-m);
                }
                a2 = a1/n;

                System.out.println(Math.sqrt(a2));
            }
        }

        sc.close();
    }
}
