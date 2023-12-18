import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] s = new int[100];
        int max,min;
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0){break;}

            int sum=0;
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }

            max = s[0];
            min = s[0];
            for(int i=1;i<n;i++){
                if(max < s[i]){max = s[i];}
                if(min > s[i]){min = s[i];}
            }

            System.out.println((sum-max-min)/(n-2)); 
        }
    }
}
