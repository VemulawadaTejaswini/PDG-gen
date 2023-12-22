import java.util.*;
public class Main {
 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  	String[] input = sc.nextLine().split(" ");
  	
  	int a=Integer.parseInt(input[0]);
  	String op = input[1];
  	int b=Integer.parseInt(input[2]);
 
    int ans=0;
  	
  	switch (op){
  	case "+":
  		ans = a+b;
  		break;
  	case "-":
  		ans = a-b;
  		break;
  	}
    System.out.println(ans);
  }
}