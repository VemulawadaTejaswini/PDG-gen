
import java.util.*;
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n=sc.nextInt();
            if(n==0)
            {
                break;
            }
            double avg = 0;
            double avgd = 0;
            //???????????????
            for(int i=0; i<n; i++)
            {
                int temp=sc.nextInt();
                avg += temp;
                avgd += temp * temp;
            }
            avg/=n;
            avgd/=n;
            //?????£????±??????????
            double s = avgd-avg*avg;
            System.out.println(Math.sqrt(s));
        }
        sc.close();
    }
}