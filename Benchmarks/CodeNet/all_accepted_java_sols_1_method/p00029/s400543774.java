import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		line = input.readLine();
		String[] words = line.split(" ");
		int[] sum= new int[words.length];
		String max=null;
		String max2=null;
		int max3=0;
		for (int i=0 ; i<words.length ; i++){
			for(int j=0; j < words.length; j++){
				if(words[i].equals(words[j])){
					sum[i]++;						
				}
			}
		}
		max=words[0];
		for (int i=0; i < words.length;i++){
			if(max3 < sum[i]){
				max3=sum[i];
				max2=words[i];
			}
			if(max.length() < words[i].length()){
				max=words[i];
			}
		}
		System.out.println(max2+" "+max);
	}
}	