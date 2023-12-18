import java.util.*;
	
	/**
	 * @param sc 			ÇÝÝÏ
	 * @param field			¹ð\·zñ
	 * @param a, b 			¡Æc
	 * @param construction 	HÌð·_Ì
	 */
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int field[][];
	static boolean done[][];
	static int a,b;
	static int construction = 0;
	
	
	public static void main(String[] args) {
		while(read()){
			System.out.println(slove(b, 1));
		}
	}
	
	static boolean read(){
		/**
		 * XÌÇÝÝB
		 * àµA^eRÆàÉOÈçI¹³¹éB
		 */
		a = sc.nextInt(); b = sc.nextInt();
		if(a == 0 && b == 0)
			return false;
		
		/**
		 * XÌ¶¬Æú»B
		 * ±ÌÆ«A¾YNÌÆª(1, 1)Å é½ßÉ
		 * cA¡ÆàÉPÂæ¯¢ÉÆÁÄA´_ð(1, 1)ÉµÄ¢éB
		 */
		field = new int[b+2][a+2];
		done = new boolean[b+2][a+2];
		for(int i = 0; i < b+2; i++){
			for(int j = 0; j < a+2; j++){
				field[i][j] = -1;
				done[i][j] = false;
			}
		}
		for(int i = 1; i <= b; i++){
			for(int j = 1; j <= a; j++){
				field[i][j] = 0;
				done[i][j] = false;
			}
		}
		
		/**
		 * HÌð·_ðÇÝñÅA
		 * constructionðfor[vÌâ~ðÉp¢A
		 * HÌð·_ð«ÞB
		 */
		construction = sc.nextInt();
		for(int i = 0; i < construction; i++){
			int x, y;
			x = sc.nextInt(); y = sc.nextInt();
			field[y][x] = -1;
			done[y][x] = true;
		}
		
		return true;
	}

	static int slove(int x, int y){
		for(int i = x; i <= b; i++){
			for(int j = y; j <= a; j++){
		
				if(field[y][x+1] != -1){
					field[y][x+1]++;
					done[y][x+1] = true;
				}
				if(field[y+1][x] != -1){
					field[y+1][x]++;
					done[y+1][x] = true;
				}	

			}		
		}
		return field[1][a];
	}

}