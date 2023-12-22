import java.util.*;
class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans;
		if(a>b){
			ans = a-1;
		}else{
			ans = a;
		}
		System.out.println(ans);
	}
}