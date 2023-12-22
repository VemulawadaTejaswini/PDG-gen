import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++){
			int [] tri =new int[3];
			tri[0]=scan.nextInt();
			tri[1]=scan.nextInt();
			tri[2]=scan.nextInt();
			Arrays.sort(tri);
			if(Math.pow(tri[0],2)+Math.pow(tri[1], 2) == Math.pow(tri[2], 2))
				System.out.println("YES");
			else System.out.println("NO");
		} 
	}
}