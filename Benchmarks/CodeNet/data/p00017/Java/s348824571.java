import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			line.trim();
			String[] checkstr= new String[3];
			char check[];
			char[] str = line.toCharArray();		
			checkstr[0]="the";
			checkstr[1]="this";
			checkstr[2]="that";
			int	id,ans;	
			ans=0;
			for (int i=0;i <26; i++){
				for (int j=0;j <str.length-4; j++){
					for (int k=0;k <3; k++){
						check= checkstr[k].toCharArray();
						id=0;
						for (int l=0;l <check.length; l++){
							if((int)str[j+l]-i == (int)check[l]){
								id++;
								if (id == check.length){
									ans=i;
									break;
								}	
							}		
						}						
					}
				}		
			}	
			
			char ansc[]=new char[str.length];
			for (int i=0;i <str.length; i++){
				if (str[i] > 'a')	ansc[i]=(char)((int)str[i]-ans);
				else	ansc[i]=str[i];
			}
			System.out.println(ansc);
		}	
	}
}