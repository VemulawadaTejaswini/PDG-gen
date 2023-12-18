import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int h=Integer.parseInt(br.readLine());

	int a[]=new int[h+1];
	String str[]=br.readLine().split(" ");
	
	for(int i=0;i<h;i++){
	    a[i+1]=Integer.parseInt(str[i]);
	}

	for(int i=1;i<=h;i++){
	    System.out.print("node "+i+": key = "+a[i]+", ");
	    if(getParent(i)>=1){
		System.out.print("parent key = "+a[getParent(i)]+", ");
	    }
	    if(getLeft(i)<=h){
		System.out.print("left key = "+a[getLeft(i)]+", ");
	    }
	    if(getRight(i)<=h){
		System.out.print("right key = "+a[getRight(i)]+", ");
	    }
	    System.out.println();
	}
    }
    static int getParent(int i){
	return i/2;
    }

    static int getLeft(int i){
	return 2*i;
    }

    static int getRight(int i){
	return 2*i+1;
    }
}

