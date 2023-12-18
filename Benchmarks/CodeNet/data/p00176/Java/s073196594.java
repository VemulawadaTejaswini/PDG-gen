import java.util.Scanner;

public class Main {

	static int[][] list = {
		{0,0,0},
		{0,0,255},
		{0,255,0},
		{0,255,255},
		{255,0,0},
		{255,0,255},
		{255,255,0},
		{255,255,255},
	};
	
	static String[] name = {"black","blue","lime","aqua","red","fuchsia","yellow","white"};
	
	static int trans(char jyu, char ichi){
		int sum = 0;
		if('a'<=jyu&&jyu<='f'){
			sum += jyu-'a'+10;
		}
		else{
			sum += jyu-'0';
		}
		sum*=16;
		if('a'<=ichi&&ichi<='f'){
			sum += ichi-'a'+10;
		}
		else{
			sum += ichi-'0';
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			char[] in = stdIn.next().toCharArray();
			if(in[0]=='0'){
				return;
			}
			int r = trans(in[1],in[2]);
			int g = trans(in[3],in[4]);
			int b = trans(in[5],in[6]);
			
			double min = Double.MAX_VALUE;
			int min_idx = -1;
			for(int k=0;k<8;k++){
				double tmp = Math.abs(Math.sqrt(Math.pow(r-list[k][0],2)+Math.pow(g-list[k][1],2)+Math.pow(b-list[k][2],2)));
				if(tmp<min){
					min = tmp;
					min_idx = k;
				}
			}
			System.out.println(name[min_idx]);
		}
	}
}