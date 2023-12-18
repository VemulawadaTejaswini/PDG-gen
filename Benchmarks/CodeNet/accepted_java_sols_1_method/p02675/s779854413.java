import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int one = N%10;
      	if(one==0||one==1||one==6||one==8) System.out.println("pon");
      	else if(one==3) System.out.println("bon");
      	else System.out.println("hon");
    }
}