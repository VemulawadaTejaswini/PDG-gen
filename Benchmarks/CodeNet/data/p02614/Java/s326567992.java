import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<String>gyou = new ArrayList<String>();
	static ArrayList<String>retu = new ArrayList<String>();


	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int H = scan.nextInt();
			int W = scan.nextInt();
			int K = scan.nextInt();

			char[][]c = new char[H][W];
			String []s = new String[H];

			for(int i = 0;i<H;i++) {
				s[i] = scan.next();
				c[i] = s[i].toCharArray();
			}

			int count = 0;


			for(int i = 0;i<=H;i++) {
				if(i!=0) {
				for(int z = 0;z<=H-i;z++) {
					gyou(i-1,H,z,String.valueOf(z));
				}
				}
			}

			for(int i = 0;i<=W;i++) {
				if(i!=0) {
				for(int z = 0;z<=W-i;z++) {
					retu(i-1,W,z,String.valueOf(z));
				}
				}
			}

			//System.out.println(gyou.size());
			//System.out.println(retu.size());

			for(int i = -1;i<gyou.size();i++) {
				for(int j = -1;j<retu.size();j++) {
					String G = "";
					String R = "";
					if(i!=-1)G = gyou.get(i);
					if(j!=-1)R = retu.get(j);
					char[][]cha = new char[H][W];
					for(int k = 0;k<H;k++) for(int o = 0;o<W;o++)cha[k][o]=c[k][o];

					for(int w = 0;w<=G.length();w++) {
						int q = -1;
						if(w!=0) {
						 q=G.charAt(w-1)-'0';
						for(int x = 0;x<W;x++) cha[q][x] = '+';
						}
						for(int z = 0;z<=R.length();z++) {
							int d = -1;
							if(z!=0) {
								d=R.charAt(z-1)-'0';
								for(int xr = 0;xr<H;xr++) cha[xr][d] = '+';
							}
						}
					}

					int co = 0;
					for(int h = 0;h<H;h++) {
						for(int e = 0;e<W;e++) {
							if(cha[h][e]=='#')co++;
						}
					}

					if(co==K)count++;



				}

			}


			System.out.println(count);






		}


	}




	private static void gyou(int count,int H,int k,String S) {//count個選ぶ
		if(count!=0) {
			for(int i =k+1;i<=H-count;i++) {
				gyou(count-1,H,i,S+String.valueOf(i));
				}
		}else {
			//System.out.println(S);



			gyou.add(S);
			}
	}
	private static void retu(int count,int W,int k,String S) {//count個選ぶ
		if(count!=0) {
			for(int i =k+1;i<=W-count;i++) {
				retu(count-1,W,i,S+String.valueOf(i));
				}
		}else {
			//System.out.println(S);
			retu.add(S);
			}
	}




}

