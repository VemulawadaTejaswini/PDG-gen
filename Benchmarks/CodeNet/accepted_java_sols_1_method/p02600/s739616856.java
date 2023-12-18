import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int X = s.nextInt();
	if(400 <= X && X < 600){
		System.out.println(8);
	}else if(600 <= X && X < 800){
		System.out.println(7);
	}else if(800 <= X && X < 1000){
		System.out.println(6);
	}else if(1000 <= X && X < 1200){
		System.out.println(5);
	}else if(1200 <= X && X < 1400){
		System.out.println(4);
	}else if(1400 <= X && X < 1600){
		System.out.println(3);
	}else if(1600 <= X && X < 1800){
		System.out.println(2);
	}else{
		System.out.println(1);
	}
    
  }
}