import java.util.*;
 
public class Main{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
      	int p = 360 / X;
      if(p * X == 360){
      	System.out.println(p);
      }
      else{
        System.out.println(p + 1);
      }
	}
}