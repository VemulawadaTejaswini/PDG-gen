import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int[] r=new int[num];
		int v,j;

		for (int i=0;i<=num-1;i++ ) {
			r[i]=scan.nextInt();
		}

			      System.out.printf("%d",r[0]);
	      for(int k=1;k<=num-1;k++ ) {
				System.out.printf(" %d",r[k]);	
		   }
		   System.out.printf("\n");

	    for (int i=1;i<=num-1;i++){
	      v = r[i];
	      j = i - 1;
	      while (j >= 0 &&r[j] > v){
	      r[j+1] = r[j];
	      j--;
	      }
	      r[j+1] = v;
	      

	      System.out.printf("%d",r[0]);
	      for(int k=1;k<=num-1;k++ ) {
				System.out.printf(" %d",r[k]);	
		   }
         System.out.printf("\n");

	    }
		
	}
}

