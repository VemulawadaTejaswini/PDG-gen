import java.util.*;
import java.math.BigInteger;
import java.awt.geom.Point2D;

public class Main{
	private static int countOne(String s){
		int n = s.length();
		int res = 0;
		for(int i=0;i<n;i++){
			if(s.charAt(i) == '1') res++;
		}
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			Point2D[] t = new Point2D[n];
			for(int i=0;i<n;i++){
				String[] s = sc.next().split(",");
				t[i] = new Point2D.Double(Double.parseDouble(s[0]),Double.parseDouble(s[1]));
			}

			BigInteger[] bit = new BigInteger[n];
			ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(); //ツ各ツ円ツづ可古ーツ債キツつキツづゥツ円

			for(int i=0;i<n;i++){
				String s = "";
				ArrayList<Integer> tmp = new ArrayList<Integer>();

				for(int j=0;j<n;j++){
					double dist = t[i].distance(t[j]);
					if(dist <= 2){
						s += "1";
						if(i != j) tmp.add(j);
					}
					else s += "0";
				}

				bit[i] = new BigInteger(s,2);
				al.add(tmp);
			}

			int max = 0; //ツ出ツ療債値
			for(int i=0;i<n;i++){
				int m = al.get(i).size();

				for(int j=m;j>max;j--){
					int rem = j;
					BigInteger now = bit[i];

					for(int k : al.get(i)){
						BigInteger and = now.and(bit[k]);
						int count = countOne(and.toString(2));

						if(count >= j){
							rem--;
							if(rem == 0) break;
							now = and;
						}
					}

					if(rem == 0){
						max = j;
						break;
					}
				}
			}

			System.out.println(max + 1);
		}
	}
}