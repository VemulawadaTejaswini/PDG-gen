import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] map=new int[128];
		for(int i = 0; i<h; i++){
			String s = sc.next();
			for(int j = 0; j<w; j++){
				map[s.charAt(j)]++;
			}
		}
		int one=(h%2)*(w%2);
		int two=(h/2)*(w%2)+(h%2)*(w/2);
		int four=(h/2)*(w/2);
		for(int i = 0; i<128; i++){
			four-=map[i]/4;
			map[i]%=4;
			two-=map[i]/2;
			one-=map[i]%2;
		}
		String ans="Yes";
		if(four>0){
			ans="No";
		}
		two+=four*2;
		if(two>0){
			ans="No";
		}
		System.out.println(ans);
	}
}
