import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args){
	Scanner sc=new Scanner(new InputStreamReader(System.in));
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	sc.close();
	int x=0;
	for(int i=a;i<=b;i++){
		if(c%i==0) x++;
	}
	System.out.println(x);
	}
}