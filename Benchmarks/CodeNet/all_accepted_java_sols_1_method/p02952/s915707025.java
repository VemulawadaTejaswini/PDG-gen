import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 0;
		int j = 0;
		int count = 0;
		String digital;
		
		for(i=1; i <= N; i++){
			digital = String.valueOf(i);
			j = digital.length();
			if(j%2 != 0){
				count++;
			}
		}
		System.out.println(count);
	}
}