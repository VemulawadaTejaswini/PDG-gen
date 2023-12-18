
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			//入力
			int e = Integer.parseInt(br.readLine());
			if(e==0) break;
			
			//mの値を探す
			double m=e;
			for(int z=0; ; z++){
				double z3 = Math.pow(z, 3);
				if(z3 > e)break;
				for(int y=0; ; y++){
					double x = e -(z3 +Math.pow(y, 2));
					if(x<0) break;
					double l = x+y+z;
					if(m>l) m = l;
				}
			}
			System.out.println((int)m);
		}
		
		br.close();
	}

}

