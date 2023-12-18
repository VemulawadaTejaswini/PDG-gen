import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            if(n==0)break;
            List<Integer> data = new ArrayList<>();
            for(int i=0;i<n;i++)data.add(sc.nextInt());
            double average=0;
            for (int item:data)average+=item;
            average/=1.0*n;
            double answersqr = 0;
            for (int item:data) answersqr +=(item-average)*(item-average);
            answersqr/=n;
            System.out.printf("%.8f\n",Math.sqrt(answersqr));
        }
    }
}