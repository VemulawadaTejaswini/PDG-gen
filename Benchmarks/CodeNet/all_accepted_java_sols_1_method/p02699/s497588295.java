import java.util.*;
import java.io.*;
public class Main{
  public static void main(String [] args){

	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b){
		System.out.println("safe");
	}
	else{
		System.out.println("unsafe");
	}

  }

}