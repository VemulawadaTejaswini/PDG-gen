import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int room[] = new int[450];  // 配列確保（大きめに）
        int n = scanner.nextInt(); // データ数
        int p1 = 0,p2 = 0,p3 = 0;
        int a,b,c,x = 0;
        
        //データ初期化
        for (int i = 0; i < 450; i++) {
            room[i] = 0;
        }
        
        // データ入力
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            x = a *100 + b * 10 + (c - 1);
            room[x] += scanner.nextInt();
        }
	  	//出力
        for (int i = 1; i <= 4; i++) {
        	p1 = i * 100; 
        	for(int j = 1; j <= 4; j ++){
        		p2 = j * 10 + p1;
        		for(int k = 0; k < 10 ; k ++  ){
        			p3 = p2 + k;
		        	if(j == 4 && !(i == 4)) {
		        		if(k == 9)
		        			System.out.println("##");
		        		else
		        			System.out.print("##");
		        	}
		        	if(!(j == 4)) {
		        		if(k == 9)
		        			System.out.println(" "+ room[p3]);
		        		else
		        			System.out.print(" "+ room[p3]);
		        	}
		        	
				}
        		if(i == 4 && j == 3) {
    				//System.out.print("\n");
        			break;
        		}
				//System.out.println("");
        	}
        }
        scanner.close();
  }
}
