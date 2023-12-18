

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] A=new int[100001];
		for(int i=1;i<=n;i++){
			A[i]=scanner.nextInt();
			
		}
		
		for(int i=1;i<=n;i++){
			StringBuilder builder=new StringBuilder();
			builder.append("node "+i+": key = "+A[i]+", ");
			if(i/2>=1)
				builder.append("parent key = "+A[i/2]+", ");
			if(2*i<=n)
				builder.append("left key = "+A[2*i]+", ");
			if(2*i+1<=n)
				builder.append("right key = "+A[2*i+1]+", ");
			//builder.append("\n");
			System.out.println(builder);
		}
	}

}

