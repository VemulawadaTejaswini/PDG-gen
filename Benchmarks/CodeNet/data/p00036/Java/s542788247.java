import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static String A = "1100000011";
	static String B = "10000000100000001";
	static String C = "1111";
	static String D = "1000000110000001";
	static String E = "11000000011";
	static String F = "100000001100000001";
	static String G = "110000011";
	static String[] blocks = {A, B, C, D, E, F, G};
	static String[] dic = {"A", "B", "C", "D", "E", "F", "G"};

	public static void main(String[] args){

		while(scan.hasNext()){
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < 8; i++){
				sb.append(scan.next());
			}
			System.out.printf("%s\n", dic[solve(sb.toString())]);
		}
	}

	public static int solve(String str){
		for(int i = 0; i < 8 * 8; i++){
			for(int j = 0; j < 7; j++){
				if(8 * 8 < i + blocks[j].length()){
					return -1;
				}
				String s = str.substring(i, i + blocks[j].length());
				if(s.equals(blocks[j])){
					return j;
				}
			}
		}
		return -1;
	}
}