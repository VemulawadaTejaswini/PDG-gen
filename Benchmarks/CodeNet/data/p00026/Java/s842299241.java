import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	static int array[][]= new int[10][10];
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		StringTokenizer tokenizer1,tokenizer2;
		int a[] = new int[3];
		int max=0, sum=0;
		
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			tokenizer1 = new StringTokenizer(line,",");
			for(int i=0;i<3;i++){
				a[i]=Integer.parseInt(tokenizer1.nextToken());
			}
			if(a[2]==1){
				small(a[0],a[1]);
			}
			if(a[2]==2){
				mid(a[0],a[1]);
			}
			if(a[2]==3){
				big(a[0],a[1]);
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){			
				max=Math.max(max, array[i][j]);
				if(array[i][j]==0){
					sum++;	
				}
			}
		}
		System.out.println(sum);
		System.out.println(max);
	}
	public static void small (int a, int b){
		int a2,b2;
		for(int i=0;i<3;i++){
			a2=a+i-1;			
			if (a2 > -1 && a2<10 ){
				array[a2][b]++;							
			}
		}
		for(int i=0;i<3;i++){
			b2=b+i-1;			
			if (b2 > -1 && b2<10 ){
				array[a][b2]++;							
			}
		}
		array[a][b]--;
	}
	public static void mid (int a, int b){
		int a2,b2;
		for(int i=0;i<3;i++){
			a2=a+i-1;			
			for(int j=0;j<3;j++){
				b2=b+j-1;
				if (a2 > -1 && a2< 10 && b2 > -1 && b2 < 10){
					array[a2][b2]++;	
				}
			}
		}
	}
	public static void big (int a, int b){
		mid(a,b);
		int i=2;
		int a2,b2;
		a2=i+a;
		if (a2 > -1 && a2<10){
			array[a2][b]++;	
		}
		a2=-i+a;
		if (a2 > -1 && a2<10){
			array[a2][b]++;	
		}
		b2=i+b;
		if (b2 > -1 && b2<10){
			array[a][b2]++;	
		}
		b2=-i+b;
		if (b2 > -1 && b2<10){
			array[a][b2]++;	
		}
	}
}	