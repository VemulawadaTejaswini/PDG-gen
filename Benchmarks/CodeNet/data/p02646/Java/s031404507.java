import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a=sc.nextInt();	
      	int v=sc.nextInt();	
      	int b=sc.nextInt();	
      	int w=sc.nextInt();	
      	int t=sc.nextInt();	
      	String ans="NO";
      	if(Math.abs(a-b)<=((v-w)*t)){ans="YES";}
      System.out.println(""+ans);
}
}