import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int flag = 0;
		for(int i=N; i<1000; i++){
			flag = sepNumber(i);
			if(flag == 1){
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
	public static int sepNumber(int x){
		String s = String.valueOf(x);
		String[] sep = s.split("");
		int tr = 0;
		if(sep[0].equals(sep[1]) && sep[1].equals(sep[2])){
			tr = 1;
		}
		return(tr);
	}
}
