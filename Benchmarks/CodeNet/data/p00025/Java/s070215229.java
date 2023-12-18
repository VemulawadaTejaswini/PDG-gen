import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	try{
	    String t;
	    while((t = sc.readLine()) != null){
		int x=0, y=0;
		String[] a = t.split(" ");
		String[] b = sc.readLine().split(" ");
		int[] a1 = {Integer.valueOf(a[0]),Integer.valueOf(a[1]),Integer.valueOf(a[2]),Integer.valueOf(a[3])};
		int[] b1 = {Integer.valueOf(b[0]),Integer.valueOf(b[1]),Integer.valueOf(b[2]),Integer.valueOf(b[3])};
		for(int i=0; i<4; i++)
		    if(a1[i]==b1[i]){
			a1[i]=-1;
			b1[i]=-1;
			x++;
		    }
		for(int i=0; i<4 && a1[i]!=-1; i++)
		    for(int j=0; j<4; j++)
			if(a1[i]==b1[j])
			    y++;
		System.out.printf("%d %d\n",x,y);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}