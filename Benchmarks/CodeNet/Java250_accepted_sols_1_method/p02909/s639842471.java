import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char s = sc.next().charAt(0);
      	if(s=='S') System.out.println("Cloudy");
      	else if(s=='C') System.out.println("Rainy");
      	else System.out.println("Sunny");
    }
}