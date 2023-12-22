import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double D = sc.nextDouble();
      double T = sc.nextDouble();
      double S = sc.nextDouble();
      if(D/S<=T){
      	System.out.print("Yes");
      }else{
        System.out.println("No");
      }
    }
}
