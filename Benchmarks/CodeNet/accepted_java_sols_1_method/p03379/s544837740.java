import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int[] x=new int [n];
		int[] sort_x=new int [n];
		for (int i=0;i<n;++i){
			x[i]=Integer.parseInt(scan.next());
			sort_x[i]=x[i];
		}
		Arrays.sort(sort_x);
		int middle_1 = sort_x[n/2];
		int middle_2 = sort_x[n/2-1];
		for (int i=0;i<n;++i){
			if (x[i]<middle_1){
				System.out.println(middle_1);
			}else{
				System.out.println(middle_2);
			}
		}

	}
}
//end