import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){		
		new AOJ0111();
	}

	class AOJ0111{
		public AOJ0111() {
			
			char dot = '\'';
			//fase1　と list1が対応している。
			Map<String, String> fase1 = new HashMap<String, String>();
			fase1.put("A", "00000");fase1.put("B", "00001");
			fase1.put("C", "00010");fase1.put("D", "00011");
			fase1.put("E", "00100");fase1.put("F", "00101");
			fase1.put("G", "00110");fase1.put("H", "00111");
			fase1.put("I", "01000");fase1.put("J", "01001");
			fase1.put("K", "01010");fase1.put("L", "01011");
			fase1.put("M", "01100");fase1.put("N", "01101");
			fase1.put("O", "01110");fase1.put("P", "01111");
			fase1.put("Q", "10000");fase1.put("R", "10001");
			fase1.put("S", "10010");fase1.put("T", "10011");
			fase1.put("U", "10100");fase1.put("V", "10101");
			fase1.put("W", "10110");fase1.put("X", "10111");
			fase1.put("Y", "11000");fase1.put("Z", "11001");
			fase1.put(" ", "11010");fase1.put(".", "11011");
			fase1.put(",", "11100");fase1.put("-", "11101");
			fase1.put(dot+"", "11110");fase1.put("?", "11111");

			HashMap<String, String> hyou = new HashMap<String, String>();
			hyou.put("101", " ");
			hyou.put("000000", dot+"");
			hyou.put("000011", ",");
			hyou.put("10010001", "-");
			hyou.put("010001", ".");
			hyou.put("000001", "?");
			hyou.put("100101", "A");
			hyou.put("10011010", "B");
			hyou.put("0101", "C");
			hyou.put("0001", "D");
			hyou.put("110", "E");
			hyou.put("01001", "F");
			hyou.put("10011011", "G");
			hyou.put("010000", "H");
			hyou.put("0111", "I");
			hyou.put("10011000", "J");
			hyou.put("0110", "K");
			hyou.put("00100", "L");
			hyou.put("10011001", "M");
			hyou.put("10011110", "N");
			hyou.put("00101", "O");
			hyou.put("111", "P");
			hyou.put("10011111", "Q");
			hyou.put("1000", "R");
			hyou.put("00110", "S");
			hyou.put("00111", "T");
			hyou.put("10011100", "U");
			hyou.put("10011101", "V");
			hyou.put("000010", "W");
			hyou.put("10010010", "X");
			hyou.put("10010011", "Y");
			hyou.put("10010000", "Z");

			while(in.hasNext()){
				String input = in.nextLine();
				String change1 = "";
				for(int i=0;i<input.length();i++){
					change1+=fase1.get(input.charAt(i)+"");
				}
				String result = "";
				while(change1.length()>0){
					boolean sw =false;
					for(int i=0;i<change1.length();i++){
						if(hyou.containsKey(change1.substring(0,i))){
							result+=hyou.get(change1.substring(0,i));
							change1 = change1.substring(i);
							sw=true;
							break;
						}
					}
					if(!sw)break;
				}
				System.out.println(result);
			}
		}
	}

	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}
}