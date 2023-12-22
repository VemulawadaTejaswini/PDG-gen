import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int a[] = new int[100];  // 配列確保（大きめに）
	  	boolean tranp[] = new boolean[500];
        int n = scanner.nextInt(); // データ数
        int i;
        int x = 0;
        int y = 0;
        String Mark;
        
        for(i = 0; i < 500; i++)
        	tranp[i] = false;
        
        // データ入力
        for (i = 0; i < n; i++) {
            Mark = scanner.next();
            
            switch(Mark){
            case "S":
           		 x = 100 + scanner.nextInt();
           		 a[i] = x;
           		 tranp[x] = true;
           		 break;
           	case "H":
          		 x = 200 + scanner.nextInt();
          		 a[i] = x;
          		 tranp[x] = true;
          		 break;
           	case "C":
          		 x = 300 + scanner.nextInt();
          		 a[i] = x;
          		 tranp[x] = true;
          		 break;
           	case "D":
          		 x = 400 + scanner.nextInt();
          		 a[i] = x;
          		 tranp[x] = true;
          		 break;
            }
        }
        //ないカードのチェック
        for(i = 1; i <= 4 ; i++){
        	y = i *100;
        	for(int j = 1; j <= 13; j ++ ){
        		if(!(tranp[y + j]) ) {
        			switch(y){
		            case 100:
		           		 System.out.println("S " + j);
		           		 tranp[y + j] = true;
		           		 break;
		           	case 200:
		           		 System.out.println("H " + j);
		           		 tranp[y + j] = true;
		           		 break;
		           	case 300:
		           		 System.out.println("C " + j);
		           		 tranp[y + j] = true;
		           		 break;
		           	case 400:
		           		 System.out.println("D " + j);
		           		 tranp[y + j] = true;
		           		 break;
		        	}
        		}
        	}
        }
        scanner.close();
  }
}
