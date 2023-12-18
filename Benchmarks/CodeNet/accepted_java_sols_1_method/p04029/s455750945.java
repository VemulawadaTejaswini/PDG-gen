import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int all=0;
		int i=0;
		
		for(i=1;i<=N;i++){
			all+=i;
		}
		System.out.print(all);

	}

}