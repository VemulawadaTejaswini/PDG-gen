import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] A=new int[3];
		int[] diffe=new int[2];
		int[] diffe_tmp=new int[2];
		int flag=0;
		String ans="null";

		for(int i=0;i<3;i++) A[i]=sc.nextInt();

		diffe[0]=A[0]-A[1];
		diffe[1]=A[1]-A[2];

		for(int i=0;i<=1;i++){
			for(int j=0;j<3;j++) A[j]=sc.nextInt();

			diffe_tmp[0]=A[0]-A[1];
			diffe_tmp[1]=A[1]-A[2];
			if(diffe[0]!=diffe_tmp[0] || diffe_tmp[1]!=diffe[1]) flag=1;
		}
		
		if(flag==0) ans="Yes";
		else ans="No";

		System.out.println(ans);
	}
}