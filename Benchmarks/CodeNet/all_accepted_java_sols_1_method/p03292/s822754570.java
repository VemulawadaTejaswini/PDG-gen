import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                
                int[] a = new int[3];
                int[] b = new int[100];
                int i=0,sum=0;
                float sum1=0;
                for(i=0;i<3;i++){
                   a[i] = s.nextInt();
                }
                Arrays.sort(a);
                System.out.println(a[2]-a[0]);
                
	}
}