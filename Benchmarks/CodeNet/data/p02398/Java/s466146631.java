import java.util.*;

public class Main{
	public static void main(String[] args){
		int i;
		int count =0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for(i=a; i<=b; i++){
		//for(i =a; i<=b; i++){
			if(c%i == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}