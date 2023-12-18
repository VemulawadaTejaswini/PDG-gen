import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        int n = Integer.parseInt(line1);
        String[] array = line2.split(" ");
        
        int maxPosition = 0;
        int minPosition = 101;
        
        for(int i = 0; i < n; i++)
        {
            int bufPosition = Integer.parseInt(array[i]);
            if(bufPosition > maxPosition)
            {
                maxPosition = bufPosition;
            }
            if(bufPosition < minPosition)
            {
                minPosition = bufPosition;
            }
        }
        int minSum = 1000000;
        for(int p = minPosition; p <= maxPosition; p++)
        {
            int bufSum = 0;
            for(int i = 0; i < n; i++)
            {
                int bufPosition = Integer.parseInt(array[i]);
                bufSum += (bufPosition - p) * (bufPosition - p);
            }
            if(bufSum < minSum)
            {
                minSum = bufSum;
            }
        }    
        System.out.println(minSum);
    }
}
