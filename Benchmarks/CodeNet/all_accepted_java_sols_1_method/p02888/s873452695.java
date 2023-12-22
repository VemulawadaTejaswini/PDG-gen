import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		}
      Arrays.sort(d);
		int c = 0; 
		for(int i = 0; i < a; i++){
				for(int j = i + 1; j < a; j++){
					int ok = j;
                      int no = a;
                  while(ok + 1 != no){
                  	if(d[(ok + no) / 2] < d[i] + d[j]){
                    	ok = (ok + no) / 2;
                    }else{
                    	no = (ok + no) / 2;
                    }
                  }
                  c += ok - j;
                  //System.out.println(ok);
                  //System.out.println(j);
							
				}
						
		}
					
		
		System.out.println(c);
		
		
	}
}