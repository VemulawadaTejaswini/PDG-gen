import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			double d = sc.nextInt();
      		double t = sc.nextInt();
      		double s = sc.nextInt();
      		double A = d/s;
      		if(A <= t){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
	}
}