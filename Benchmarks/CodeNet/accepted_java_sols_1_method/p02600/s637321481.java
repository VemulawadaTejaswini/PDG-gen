import java.util.*;
import java.io.*;
import java.lang.*; 
public class Main {
	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		int tt = sc.nextInt();
		if(tt<600){
		    System.out.println(8);
		}else 
		if(tt<800){
		    System.out.println(7);
		}else
		if(tt<1000){
		    System.out.println(6);
		}else if(tt<1200){
		    System.out.println(5);
		}else
		if(tt<1400){
		    System.out.println(4);
		}else
		if(tt<1600){
		    System.out.println(3);
		}else
		if(tt<1800){
		    System.out.println(2);
		}else
		if(tt<2000){
		    System.out.println(1);
		}
    }
}