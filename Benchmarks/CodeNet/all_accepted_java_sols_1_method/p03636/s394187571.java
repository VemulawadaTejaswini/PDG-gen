import java.util.*;

public class Main{

  	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      
      	String str=sc.next();
      
      	String[] input=str.split("");
      
      	int length=input.length-2;
      
      	String result=input[0]+String.valueOf(length)+input[input.length-1];
      
      	System.out.println(result);
      	
    }

}