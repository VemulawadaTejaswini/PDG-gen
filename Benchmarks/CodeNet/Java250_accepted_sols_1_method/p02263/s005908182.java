
import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(
			new InputStreamReader(System.in));
		int[] a=new int[512];
		int c=0;
		String l[]=br.readLine().split(" ");
		for(int i=0;i<l.length;i++){
			switch(l[i]){
				case "+":c--;if(c-1>=0)a[c-1]=a[c-1]+a[c];break;
				case "-":c--;if(c-1>=0)a[c-1]=a[c-1]-a[c];break;
				case "*":c--;if(c-1>=0)a[c-1]=a[c-1]*a[c];break;
				default:a[c]=Integer.parseInt(l[i]);c++;break;
			}
		}
		System.out.println(a[0]);
	}
}