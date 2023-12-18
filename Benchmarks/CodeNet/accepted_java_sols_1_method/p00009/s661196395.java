import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Scanner reader=new Scanner(System.in);
		String s;
		
		boolean[] num=new boolean[1000000];
		for(int i=3;i<1000000;i+=2){
			if(num[i]==true)continue;
			for(int j=3*i;j<1000000;j+=i*2)
				num[j]=true;
		}
		for(int i=4;i<1000000;i+=2)num[i]=true;
		
		while((s=reader.readLine())!=null){
			int in=Integer.parseInt(s);
			int co=0;
			for(int i=2;i<=in;i++){
				if(num[i]!=true)co++;
			}
			System.out.println(co);
		}

	}
}