import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		String ans = Integer.toString(x-k+1);
		if(k>1){
		for(int i=x-k+2;i<x+k;i++){
			ans += " " + Integer.toString(i);
		}
		}
        System.out.println(ans);
	}
}