import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String line = br.readLine();
	int n = Integer.parseInt(line);
	while(n!=0){
	    int answer = -2000000;
	    int sum = 0;
	    for(int i =0;i<n;i++){
		int a = Integer.parseInt(br.readLine());
		sum=Math.max(a,sum+a);
		answer=Math.max(answer,sum);
	    }
	    System.out.println(answer);
	    n=Integer.parseInt(br.readLine());
	}
    }
}
		