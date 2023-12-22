import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n =scn.nextInt();
		int k =scn.nextInt();
		  HashSet<Integer> hs =new HashSet<>();
		  for(int i=0;i<k;i++){
			  int d =scn.nextInt();
			  for(int  j=0;j<d;j++){
				  hs.add(scn.nextInt());
			  }
		  }
		
                   System.out.println(n-hs.size());
	}

}