import java.io.*;

public class Main{
	public static int findGcd(int f1, int f2){
		int gcd = 1;
		int max, min;
		if(f1 > f2){max = f1; min = f2;}
		else{max = f2; min = f1;}
		for(int i=2; i<=(int)(Math.sqrt(max)+1); i++){
			if((max % i) == 0 && (min % i) == 0){
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static int findlcm(int f1, int f2){
		int lcm = 0;
		int max, min;
		if(f1 > f2){max = f1; min = f2;}
		else{max = f2; min = f1;}
		int i=1;
		while(lcm == 0){
			if((max * i)%min == 0){
				lcm = max * i;
			}
			i++;
		}
		return lcm;
	}
	
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			String[] lineArray = line.split(" ");
			int[] factor = {Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1])};
			int gcd = findGcd(factor[0], factor[1]);
			int lcm = findlcm(factor[0], factor[1]);
			System.out.printf("%d %d\n", gcd, lcm);
		}
	}
}