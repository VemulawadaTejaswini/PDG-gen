import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int min=1000001,max=−1000001,sum = 0;
        for(int i = 0;i<n;i++){
            int t = sc.nextInt();
            if(t<=min)min=t;
            if(t>=max)max=t;
            sum += t;
        }
        System.out.println(min+" "+max+" "+sum);
        sc.close();
    }
}

