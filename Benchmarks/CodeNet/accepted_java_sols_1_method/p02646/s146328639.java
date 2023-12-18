import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();
		long distance = Math.abs(a - b);
		if(distance / t  >  v - w)
			System.out.println("NO");
      else if(distance / t  ==  v - w){
       if(distance % t == 0)
         System.out.println("YES");
        else
          System.out.println("NO");
      }
		else
			System.out.println("YES");


	}

}
