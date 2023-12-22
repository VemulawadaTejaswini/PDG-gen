import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 import java.util.Arrays;
import java.util.Comparator;
 
class Main{
  public static void main(String[] args)throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
  
    String[] strAry = str.split(" ");
    int a = Integer.parseInt(strAry[0]);
  	int b = Integer.parseInt(strAry[1]);
  	int c = Integer.parseInt(strAry[2]);
    int d;
  	
  	if ( a>b ) { d=a;a=b;b=d;}
	if ( b>c) { d=b; b=c;c=d;}
 	if ( a>b ) { d=a;a=b;b=d;}
  	
System.out.println( a +" "+ b +" "+c);
  	
  	
  } 
}