import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count4=0;
		int count2 =0;
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			if(a%4==0){
				count4++;
			}else if(a%2==0){
				count2++;
			}
		}
		if(count2>1){
			n=n-count2+1;
		}
		if(count4>=n-count4-1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}