import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		// 文字列の入力
		int[] d = new int[a];
		int e = 0;
		String h = sc.nextLine();
      String f = sc.nextLine();
		for(int i = 0; i < a; i++){
			if(f.substring(i,i + 1).equals("W")){
				d[i] = 1;
				
			}else{
				d[i] = 0;
              e++;
			}
		}
		int g = 0; 
		for(int i = 0; i < e; i++){
			g += d[i];
		}
		
		System.out.println(g);
		
		
	}
}