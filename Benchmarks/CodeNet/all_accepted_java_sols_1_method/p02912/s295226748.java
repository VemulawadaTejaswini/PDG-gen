import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		// 文字列の入力
		int[] d = new int[a];
		int[] e = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
			e[i] = d[i];
			if(c < d[i]){
				c = d[i];
			}
		} 
					int ok = c;
					  int no = -1;
					  int s;
					  int r = 0;
                  while(ok - 1 != no){
					s = (ok + no) / 2;
                    r = 0;
					for(int i = 0; i < a; i++){
						d[i] = e[i];
					}
					  for(int i = 0; i < a; i++){
						  for(int j = 0;d[i] > s;j++){
							  d[i] = d[i] / 2;
							r++;
						  }
					  }
                  	if(r < b + 1){
                    	ok = s;
                    }else{
                    	no = s;
                    }
                  }
		
		int f = ok - ok / 2;
      r = 0;
		for(int i = 0; i < a; i++){
			for(int j = 0;e[i] > ok;j++){
				e[i] = e[i] / 2;
			  r++;
			}
		}
		long g = 0;
		for(int i = 0; i < a; i++){
			g += e[i];
          //System.out.println(e[i]);
		}
		System.out.println(g - f * (b - r));
      //System.out.println(f * (b - r));
      //System.out.println(g);
      
		
		
	}
}