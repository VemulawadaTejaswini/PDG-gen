import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		int[] weight={1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		int a=0;
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			a=Integer.parseInt(line);
			int k=0;
			while(a>weight[k]){
				k++;	
			}
			int sum=0;
			int[] use= new int[10];
			for (int i=k;i>0;i--){
				if(sum+weight[i] <= a){
					sum+=weight[i];
					use[i]=1;
				}
			}
			for(int j=0;j<k-1;j++){
				if(use[j]==1){
					System.out.print(weight[j]+" ");
				}
			}
			System.out.println(weight[k-1]);
		}
	}
}	