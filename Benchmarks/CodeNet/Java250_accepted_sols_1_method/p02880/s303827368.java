import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ans="No";
		for(int i=1;i<=9;i++){
			for(int k=1;k<=9;k++){
				if(i*k==N){
				ans="Yes";
				}
			}
		}
		System.out.println(ans);
    }
}