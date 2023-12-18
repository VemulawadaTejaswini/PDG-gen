import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int D = sc.nextInt();
      int E = 25 - D;
      String F = "Christmas";
      String G = " Eve";
      for(int i=0;i<E;i++){
        F = F+G;
      }
      System.out.println(F);
    }
}