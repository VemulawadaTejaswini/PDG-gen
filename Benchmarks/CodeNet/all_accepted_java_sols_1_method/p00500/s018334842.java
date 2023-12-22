import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[][] in = new String[Integer.valueOf(r.readLine())][];
		
		for(int i=0; i<in.length; i++){
			in[i] = r.readLine().split(" ");
		}
		
		// START //
		int[] pts = new int[in.length];
		
		for(int t2=0; t2<in[0].length; t2++){
			for(int t1=0; t1<in.length; t1++){
				for(int t1c=0; t1c<in.length; t1c++){
					if(t1 != t1c && in[t1][t2].equals(in[t1c][t2])){
						break;
					}else{
						if(t1c+1 == in.length){
							pts[t1] += Integer.valueOf(in[t1][t2]);
						}
					}
				}
			}
		}
		
		for(int pt : pts){
			System.out.println(pt);
		}
		// E N D //
	}
}