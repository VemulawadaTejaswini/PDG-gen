
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		
		String s [] = new String[H];
		for(int i=0;i<H;i++) {
				s[i]=sc.next();
		}
		
		int v[][] = new int[H][W];
		for(int[] tmp:v) {
			Arrays.fill(tmp, -1);
		}
		//上段から#がある行がちょうど1つになるように区切る
		List<Integer> Hmemo = new ArrayList<Integer>();
		for(int i=0;i<H;i++) {
			if(s[i].indexOf("#")!=-1) {
				Hmemo.add(i);
			}
		}
		
		//横に見る
		int memo = 0;
		int Hbefore = 0;
		for(int tmp:Hmemo) {
			int Wbefore = 0;
			String str = s[tmp];
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='#') {
					memo++;
					//Hbeforeから、tmpまで、Wbeforeからiまでにmemoを埋める。
					for(int h=Hbefore;h<=tmp;h++) {
						for(int w=Wbefore;w<=i;w++) {
							v[h][w]=memo;
						}
					}	
					Wbefore = i+1;
					continue;
				}
				
				if(i==str.length()-1) {
					for(int h=Hbefore;h<=tmp;h++) {
						for(int w=Wbefore;w<=i;w++) {
							v[h][w]=memo;
						}
					}
				}
			}
			Hbefore = tmp+1;
		}
		if(Hbefore>0) {
		for(int h=Hbefore;h<H;h++) {
			for(int w=0;w<W;w++) {
				v[h][w]=v[h-1][w];
			}
		}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				sb.append(v[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}