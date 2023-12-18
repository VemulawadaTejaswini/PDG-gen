import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	if((A==B&&B!=C) || (B==C&&C!=A) || (C==A&&A!=B)) System.out.println("Yes");
      	else System.out.println("No");
    }
}