import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);    
		int X = in.nextInt();
		int Y = in.nextInt();
		int Z = in.nextInt();  
		int T = 0;
		T = X;
		X = Y;
		Y = T;
		T = X;
		X = Z;
        Z = T;
		System.out.println(X+" "+Y+" "+Z);
    }
}
