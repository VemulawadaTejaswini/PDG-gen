import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long sum=1;
		for(int i=0;i<n;i++){
			if(i==0){
				sum*=k;
			}else{
				sum*=(k-1);
			}
		}
		System.out.println(sum);
	}

}