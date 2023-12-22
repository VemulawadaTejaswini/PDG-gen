import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array[]=new int[N+1];
		String ans="APPROVED";
		for(int i=1;i<=N;i++){
			array[i]=sc.nextInt();
		}
		for(int i=1;i<=N;i++){
			if ((array[i]%2)==0) {
				if (((array[i]%3)==0)||(((array[i]%5)==0))) {
				}
				else{
				ans="DENIED";
				}
			}

		}
		System.out.println(ans);
    }
}