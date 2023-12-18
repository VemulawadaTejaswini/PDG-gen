import java.io.*;

public class Main{
	/*
	public static long findGcd(long f1, long f2){
		long gcd = 1;
		long max, min;
		if(f1 > f2){max = f1; min = f2;}
		else{max = f2; min = f1;}
		for(long i=1; i<=(long)(Math.sqrt(min)+1); i++){
			if(min % i == 0){
				long tmp = min / i;
				if((max % tmp) == 0){
					gcd = tmp;
					break;
				}
			}
		}
		return gcd;
	}
	
	public static long findlcm(long f1, long f2){
		long lcm = 0;
		long max, min;
		if(f1 > f2){max = f1; min = f2;}
		else{max = f2; min = f1;}
		long i=1;
		while(lcm == 0){
			if((max * i)%min == 0){
				lcm = max * i;
			}
			i++;
		}
		return lcm;
	}
	*/
	
	//最大公約数を求めるメソッド
    static long findGcd(long x, long y){
        if(x%y==0){
            return y;
        }else{
            long m = 1;
            while(m!=0){
                m = y%x;
                y = x;
                x = m;
            }
            return y;
        }
    }
    //最小公倍数を求めるメソッド
    static long findlcm(long x, long y){
        for(long i=1; i<=x; i++){
            if(y*i%x==0){
                return y*i;
            }
        }
        return 0;
    }
	
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			String[] lineArray = line.split(" ");
			long[] factor = {Long.parseLong(lineArray[0]), Long.parseLong(lineArray[1])};
			long gcd = findGcd(factor[0], factor[1]);
			long lcm = findlcm(factor[0], factor[1]);
			System.out.println(gcd + " " + lcm);
		}
	}
}