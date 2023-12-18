import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.next());
		int b = Integer.parseInt(s.next());
		float c = (float)a/(float)b;
		System.out.printf("%d %d %.5f\n",a/b,a%b,c);
	}
}
			
			