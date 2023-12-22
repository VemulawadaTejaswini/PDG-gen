import java.util.*;
 
public class Main {
	public Main(int opt1, int opt2) {
		String[] A = {"f","t","t","t"};
		A[opt1]="f";
		A[opt2]="f";
		for(int i =1; i<4; i++)
		{
			if(A[i]=="t")
			{
				System.out.println(i);
				break;
			}
		}
 
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt1 = sc.nextInt();
		int opt2 = sc.nextInt();
		Main m = new Main(opt1, opt2);
	}	
}