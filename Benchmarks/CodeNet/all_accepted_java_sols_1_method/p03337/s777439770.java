import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int[] result = {a+b, a-b, a*b};
      	Arrays.sort(result);
      	System.out.println(result[2]);
    }
}