import java.util.*;
public class Main {
	/**
	 * @param sc 	 @ÇÝæèÏ
	 * @param N		@ó¨Ì
	 * @param W		@C~ªÏ¦çêéd³
	 * @param value	@ó¨Ì¿l
	 * @param weight ó¨Ìd³
	 */
	static Scanner sc = new Scanner(System.in);
	static int N, W;
	static int[] value, weight;
	static int max = 0, index = 0;
	static int count = 1;
	
	public static void main(String[] args) {
		while(read()){		
			solve();
			System.out.println("Case "+ count +":");
			System.out.println(max);
			System.out.println(index);
			count++;
		}
	}
	
	/**
	 * @param line			ÇÝñ¾sðêIÉÛ¶·éÏ
	 * @param devide 	line©ç,ÅæØÁÄ¨óÌ¿lÆd³ðÛ·ézñ
	 */
	public static boolean read(){
		
		W = Integer.parseInt(sc.nextLine());
		if(W == 0)return false;
		
		N = Integer.parseInt(sc.nextLine());
		value = new int[N];
		weight = new int[N];
		String line;
		
		for(int i = 0; i < N; i++){
			line = sc.nextLine();
			String[] devide = line.split(",");
			value[i] = Integer.parseInt(devide[0]);
			weight[i] = Integer.parseInt(devide[1]);
		}
		
		return true;
	}
	/**
	 * Sample InputÅ±Ìæ¤Èîñª^¦çêÄ¢éB
	 * C~Ìå«³@50
	 * óÌ@		5
	 * i¨ 		0	1	 2	  3	   4	
	 * weight   10	20   30   45   4
	 * value	60  100  120  210  10
	 * 
	 * ûjEEEÅÉi¨0ÌÝðgÁÄÝÄA»Ìãi¨1ðg¤×«©ärµÄ
	 * 		@ßéB±ÌÆ«Ai¨ÌÝð0ðgÁ½Æ«Ìîñðp·éB
	 * 
	 * (1)i¨0ÌÝðgÁ½ê
	 * å«³			0  10  
	 * ¿lÌv	0  60  
	 * 
	 * (2)i¨0Æi¨1ðgÁ½ê
	 * å«³			0  10  20  30    
	 * ¿lÌv	0  60  100 160 
	 * 
	 * (3)i¨0Æi¨1Æi¨2ðgÁ½ê
	 * å«³			0  10  20  30  40  
	 * ¿lÌv	0  60  100 160 180
	 * 
	 * (4)i¨0Æi¨1Æi¨2Æi¨3ðgÁ½ê
	 * å«³			0  10  20  30  40  45  
	 * ¿lÌv	0  60  100 160 180 210
	 * 
	 * (5)i¨0Æi¨1Æi¨2Æi¨3Æi¨4ðgÁ½ê
	 * å«³			0  4  10  14  20  24  30  34  40  44  45  49  
	 * ¿lÌv	0  10 60  70  100 110 160 170 180 190 210 220 
	 * 
	 * @param total ibvTbNÌå«³
	 * 
	 * 	 */
	static void solve(){
		/*for(int i = 0; i < N; i++){
			System.out.print(value[i]);
			System.out.println(" " + weight[i]);
		}*/
		int[] total = new int[W+1];
		int repackTotal = 0;
		
		/**
		 * totalzñÌú»
		 */
		for(int i = 0; i < W; i++){
			if(i > weight[0]){
				total[i] = value[0];
			}else{
				total[i] = 0;
			}
		}
		for(int i = 1; i < N; i++){
			if(weight[i] < W){//C~ÌÏvlæèàå«ÈàÌÍüêÈ¢B
				if(total[weight[i]] < value[i]){//¿lªXVÅ«éÈç
					total[weight[i]] = value[i];//¿lðXV·éB
					for(int j = weight[i]; j < W; j++){
						if(total[j] > total[j+1]){
							total[j+1] = value[i];
						}
						repackTotal = total[j - weight[i]] + value[i];
						//System.out.print(repackTotal + " ");
						if(repackTotal > total[j])
							total[j] = repackTotal;
					}
				}
			}
		}
		/*System.out.println();
		for(int i = 0; i < W; i++){
			System.out.print(total[i] + " ");
		}*/
		
		
		for(int i = 0; i < W; i++){
			if(total[i] > total[i+1])
				max = total[i];
				index = i;
		}
	}//solveÌIíè
}