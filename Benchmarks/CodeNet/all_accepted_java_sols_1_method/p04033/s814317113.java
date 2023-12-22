import java.util.*; 
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt(), b=sc.nextInt(); 
		if(a==0 || b==0 || a*b<0) System.out.println("Zero");
		else if(a>0 && b>0) System.out.println("Positive");
		else System.out.println(((b-a+1)%2==0)?"Positive":"Negative");
		sc.close(); 
	}

}