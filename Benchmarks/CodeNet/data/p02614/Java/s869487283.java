import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		String str[] = in.nextLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);

		String s[]=new String[6];
		for(int i=0;i<h;i++)
			s[i]=in.nextLine();
		
		int ans = 0;
		for(int a=0;a<(1<<h);a++){
			for(int b=0;b<(1<<w);b++){
				int cnt = 0;
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if(nth_bit(a, i) && nth_bit(b, j) && (s[i].charAt(j) == '#'))
							cnt++;
					}
				}
				if(cnt == k)
					ans++;
			}
		}
		out.println(ans);
	}

	public static boolean nth_bit(int num, int n){
		if(((num >> n) & 1) == 1)
			return true;
		return false;
	}
}
// ABC -173
