import java.util.Scanner;                      
                                               
 class Main {                                  
    public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);      


    	 
         int n = scanner.nextInt(); //		入力する数字の個数を設定
         int[] a;                   //      不特定多数の数字を入れるため配列aを設定
         a = new int[n];
         
         for(int i=0;i<n;i++){
        	a[i]= scanner.nextInt(); //      nの数だけ配列に入力
         }
        int max=a[0];               
        int min=a[0];              
        Long sum=(long)0;                 
        // 最大値,最小値,合計値を求めるためmax,min,sumをそれぞれ設定、max,minの初期値は配列の最初の数にする
        //またsumはint型だと合計が大きくなりすぎる可能性があるのでLong型に変換する
        
         for (int i=0; i<n; i++) {
           sum=sum+a[i];       //繰り返すたびに合計値を更新

              if (max < a[i]) {
               max = a[i];     //現在のmaxと比較し大きい方をmaxに代入
               }
              if (min > a[i]) {
               min = a[i];     //現在のminと比較し小さい方をminに代入
               }
          }
        
         
         System.out.println(min+" "+max+" "+sum);
          
        
 
  scanner.close();
 }
 }

    
