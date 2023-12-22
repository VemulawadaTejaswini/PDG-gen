import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
                        Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] tab = new int[n];
			int cptA = 0, cptB = 0;
			for(int i=0; i<n; i++)
			{
				tab[i] = in.nextInt();
			}
			for(int i = 0; i < n ; i++){
				int temp = tab[i];
				for(int j=0; j<n; j++)
				{
					if(tab[i] > tab[j])
					{
						temp = tab[j];
						tab[j] = tab[i];
						tab[i] = temp;
					}
				}
			}
			for(int i=0; i<n; i++)
			{
				if(i % 2 == 0)
					cptA += tab[i];
				else
					cptB += tab[i];
			}
			int ans = cptA - cptB;
			System.out.println(ans);
}}