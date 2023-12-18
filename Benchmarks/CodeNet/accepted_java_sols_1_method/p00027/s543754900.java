import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		//BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Scanner reader=new Scanner(System.in);
		//int in=reader.nextInt();
		int[] tmp={31,29,31,30,31,30,31,31,30,31,30,31};
		String[] ans={"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
		int a,b;
		while(true){
			a=reader.nextInt();
			b=reader.nextInt();
			if(a==0&&b==0)break;
			int h=1;
			int co=0;
			while(h!=a){
				co+=tmp[h-1];
				h++;
			}
			co+=b;
			System.out.println(ans[co%7]);
		}	
	}
}