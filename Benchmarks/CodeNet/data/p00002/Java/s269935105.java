import java.util.Scanner;
import java.Math.*;
 
public class Main
{
    public static void main(String[] args)
    {
	Scanner cin = new Scanner(Sytem.in);
	int[] a,b,c;
 	while(cin.hasNext()){
		a = cin.nextInt();
		b = cin.nextInt();
		c = a + b;
		for(int i=1; i<100; i++){
			if(c/Math.pow(10,i) < 1){System.out.println(i);
			break;
		}
	}
    }
}