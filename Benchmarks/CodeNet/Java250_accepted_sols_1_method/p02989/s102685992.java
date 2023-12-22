import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[]args){
    	Scanner sc=new Scanner(System.in);
      	int N=sc.nextInt();
      	int array[]=new int[N];

      	for(int t=0;t<N;t++){
        	array[t]=sc.nextInt();
        }

      	Arrays.sort(array);
				int big=N/2;
				int small=N/2-1;

				

				System.out.println(array[big]-array[small]);
}
}
