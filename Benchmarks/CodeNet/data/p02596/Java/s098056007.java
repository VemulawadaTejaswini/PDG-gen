package datatypes;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	long K = sc.nextInt();
	long S[]= {7,77,777,7777,77777};
	int F=0;
	for (int i =0;i<5;i++)
	{
	if (S[i]%K==0)
	{
		System.out.println(++i);
		F=1;
	}
	}
	if(F==0)
	{
		System.out.println(F);
	}
	}
}

