import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 0 1 ナップサック
class Main{
	public static void main(String[] args) {

		int[] value;
		int kazu=0;
		int kaisi=0,owari=0;
		int wa=0;
		int wa1_max=-2147483646;
		int total_max=-2147483646;
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			while(true) {
				str=bfr.readLine();
				kazu=Integer.parseInt(str);
				if(kazu==0) {
					System.exit(0);
				}
				else{
					value=new int[kazu];

					for(int i=0; i<kazu; i++) {
						str=bfr.readLine();
						value[i]=Integer.parseInt(str);
					}
					for(int i=0; i<kazu; i++) {
						kaisi=i;
						for(int j=i; j<kazu; j++) {
							wa+=value[j];
							if(wa>wa1_max) {
								wa1_max=wa;
								owari=j;
							}
							else {}
							if(wa1_max>total_max) {
								total_max=wa1_max;
							}
							else {}
						}
						wa1_max=-2147483646; wa=0;
					}
					System.out.println(total_max);
					total_max=-2147483646; kazu=-2147483646;
				}
			}
		}catch(IOException e) {
		}
	}
}
