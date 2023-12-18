import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] a;
		long x,y;
		
		while(str!=null){
			a=str.split(" ",0);
			x=Integer.parseInt(a[0]);
			y=Integer.parseInt(a[1]);
			System.out.println(koyaku(x,y)+" "+kobai(x,y));
			str=br.readLine();
		}

	}
	
	public static long kobai(long x, long y){
		long l,s,num;
		if(x>=y){l=x;s=y;}
		else{l=y;s=x;}
		
		num=l;
		while(num%s!=0){
			num=num+l;
		}
		return num;
	}
	
	public static long koyaku(long x, long y){
		long l,s,num,i;
		if(x>=y){l=x;s=y;}
		else{l=y;s=x;}
		
		num=-1;
		i=2;
		while(i<=s){
			if(l%i==0 && s%i==0){
				num=i;
			}
			i++;
		}
		return num;
	}

}