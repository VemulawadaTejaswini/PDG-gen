import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int Z = sc.nextInt();
      int W;
      W=X;
      X=Y;
      Y=W;
      
      W=X;
      X=Z;
      Z=W;
      System.out.println(X+" "+Y+" "+Z);
    }
}