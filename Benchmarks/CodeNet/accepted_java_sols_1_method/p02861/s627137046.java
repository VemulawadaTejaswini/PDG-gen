import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int[] d = new int[a];
		int[] e = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
          e[i] = sc.nextInt();
		} 
		
		double b = 0;
		for(int i = 0;i < a;i++){
			for(int j = 0;j < a;j++){
				b += Math.pow(((d[i] - d[j]) * (d[i] - d[j]) + (e[i] - e[j]) * (e[i] - e[j])),0.5);
				//System.out.println(i);
              	//System.out.println(j);
              	// System.out.println(e[i]);
              	// System.out.println(e[j]);
              	//System.out.println(Math.pow(((d[i] - d[j]) * (d[i] - d[j]) + (e[i] - e[j]) * (e[i] - e[j])),0.5));
              	
            }
		}
		b = b / (a);
		System.out.println(b);
		
		
	}
}