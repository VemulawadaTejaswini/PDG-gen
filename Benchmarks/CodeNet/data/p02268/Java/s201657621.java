import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	static boolean search(int[] S,int a,int b,int target){
		if(a==b){
			if(S[a]==target){
				return true;
			}else{
				return false;
			}
		}else{
			if(S[(a+b)/2]==target){
				return true;
			}else{
				if(S[(a+b)/2]<target){
					return search(S,(a+b)/2+1,b,target);
				}else{
					return search(S,a,(a+b)/2-1,target);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int S[]=new int[n];
		for(int i=0;i<n;i++){
			S[i]=scan.nextInt();
		}
		Arrays.sort(S);
		int q=scan.nextInt();
		int count=0;
		for(int i=0;i<q;i++){
			if(search(S,0,n-1,scan.nextInt())){
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}