
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        Double[] iData = new Double[8];

        int dataSet = sc.nextInt();
        while ( c < dataSet ) {
            for ( int i = 0; i < 8; i++ )
                iData[i] = sc.nextDouble();
            
            if ( (iData[3] - iData[1]) / (iData[2] - iData[0])
                 == (iData[7] - iData[5]) / (iData[6] - iData[4]) )
                System.out.println("YES");
            else
                System.out.println("NO");
            c++;
        }
    }
}