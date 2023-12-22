import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int i=1;
		if(k%2==0){
			System.out.println(-1);
			return;
		}
		int num=7;
		for(;i<=k;i++){
			if(num%k==0){
				System.out.println(i);
				return;
			}
			num=(num*10+7)%k;
		}
		System.out.println(-1);
		sc.close();
		return;
	}
}