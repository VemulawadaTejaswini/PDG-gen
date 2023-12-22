import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=100000;
		for(int i=0;i<n;i++){
			x=(int) (1.05*x);
			if(x%1000!=0){
				x=((x/1000)+1)*1000;
			}
		}
		System.out.println(x);
	}
}