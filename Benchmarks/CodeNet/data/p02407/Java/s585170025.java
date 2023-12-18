import java.util.Scanner;                      
                                               
 class Main {                                  
    public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);      


    	 
         int n = scanner.nextInt(); //		入力する数字の個数を設定
         int[] a;                        //  特定多数の数字を入れるため配列aを設定
         a = new int[n];
         
         for(int i=0;i<n;i++){
        	a[i]= scanner.nextInt(); //      nの数だけ配列に入力
         }
        int b=n;                     //     繰り返し回数の設定のためbにnを代入
         for(int i=0;i<b;i++){
        	if(i == b-1){
        		System.out.println(a[n-1]);  //最後の入力では空白を入れずに出力する
        	}
        	
        	else{	
        	System.out.print(a[n-1]+" "); //配列の大きい数字から順に出力
        	 n--;
        	 
         }}
         
 
  scanner.close();
 }
 }

