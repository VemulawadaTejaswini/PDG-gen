import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int[] aIn = new int[3];
		int[] aOut = new int[3];
		int[] bIn = new int[3];
		int[] bOut = new int[3];
		int[] cIn = new int[3];
		int[] cOut = new int[3];
		for(int i = 0; i < 3; ++i)
		{
			aIn[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 3; ++i)
		{
			aOut[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 3; ++i)
		{
			bIn[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 3; ++i)
		{
			bOut[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 3; ++i)
		{
			cIn[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 3; ++i)
		{
			cOut[i] = stdIn.nextInt();
		}
		int a = 0, b = 0, c = 0;
		a += 3600 * (aOut[0] - aIn[0]) + 60 * (aOut[1] - aIn[1]) + (aOut[2] - aIn[2]);
		System.out.println((a / 3600) + " " + ((a % 3600) / 60) + " " + ((a % 3600) % 60));
		b += 3600 * (bOut[0] - bIn[0]) + 60 * (bOut[1] - bIn[1]) + (bOut[2] - bIn[2]);
		System.out.println((b / 3600) + " " + ((b % 3600) / 60) + " " + ((b % 3600) % 60));
		c += 3600 * (cOut[0] - cIn[0]) + 60 * (cOut[1] - cIn[1]) + (cOut[2] - cIn[2]);
		System.out.println((c / 3600) + " " + ((c % 3600) / 60) + " " + ((c % 3600) % 60));
	}
}