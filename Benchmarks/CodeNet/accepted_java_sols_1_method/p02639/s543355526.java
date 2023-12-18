import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sunua[]=new int [5];
		int ans=0;
		for(int i=0; i<5; i++) {
			sunua[i]=sc.nextInt();
			if(sunua[i]==0) {
				ans=i+1;
			}	
	  }	
		System.out.println(ans);
	}
}