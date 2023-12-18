import java.util.*;

public class  Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int a[]=new int[3];
		for(int i=0;i<3;i++)
			a[i]=input.nextInt();
		Arrays.sort(a);
		if(a[1]-a[0]==a[2]-a[1])
			System.out.println("YES");
		else
			System.out.println("NO");
			
		
	}
}