import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Scanner reader=new Scanner(System.in);
		String s;//=reader.readLine();
		//int in=reader.nextInt();
		while((s=reader.readLine())!=null){
			String[] in2=s.split(" ");
			int[] in=new int[4];
			for(int i=0;i<4;i++)in[i]=Integer.parseInt(in2[i]);
			//
			s=reader.readLine();
			in2=s.split(" ");
			int[] in1=new int[4];
			for(int i=0;i<4;i++)in1[i]=Integer.parseInt(in2[i]);
			
			int co1=0,co2=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i==j&&in[i]==in1[j])co1++;
					else if(in[i]==in1[j])co2++;
				}
			}
			System.out.println(co1+" "+co2);
		}
	}
}