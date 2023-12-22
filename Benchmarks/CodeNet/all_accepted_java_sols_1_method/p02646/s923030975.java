import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	long a=sc.nextInt();	
      	long v=sc.nextInt();	
      	long b=sc.nextInt();	
      	long w=sc.nextInt();	
      	long t=sc.nextInt();	
      	String ans="NO";
      	if(Math.abs(a-b)<=((v-w)*t)){ans="YES";}
      System.out.println(""+ans);
}
}