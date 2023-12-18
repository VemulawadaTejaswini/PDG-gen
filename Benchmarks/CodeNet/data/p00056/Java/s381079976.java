import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ptr=0;
		int[] prime=new int[50000];
		prime[ptr++]=2;
		prime[ptr++]=3;
		for(int n=5;n<=50000;n+=2){
			int i;
			double sqrtn=Math.sqrt(n);
			for(i=1;i<ptr;i++){
				if(n%prime[i]==0||prime[i]>sqrtn){
					break;
				}
			}
			if(prime[i]>sqrtn){
				prime[ptr++]=n;
			}
		}
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			int min=2;
			int max=n-2;
			while(min<=max){
				if(prime(min,ptr,prime)&&prime(max,ptr,prime)){
					count++;
				}
				min++;
				max--;
			}
			System.out.println(count);
		}
	}
	static boolean prime(int n,int ptr,int[] prime){
		if(n%2==0){
			return false;
		}else{
			for(int i=0;i<ptr+1;i++){
				if(prime[i]==n){
					return true;
				}
			}
			return false;
		}
	}
}