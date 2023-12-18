import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int[] r=new int[num];


		for (int i=0;i<=num-1;i++ ) {
			r[i]=scan.nextInt();
		}

		int min=r[0];
		int temp=r[1]-r[0];

		for(int i=1;i<=num-1;i++){
				if(temp<(r[i]-min))temp=r[i]-min;
				if(min>r[i])min=r[i];
		}

		System.out.println(temp);
		
	}
}

