import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    Scanner sc = new Scanner(System.in);
    
    int n;//全体の数
    int x;//合計した数
    int count;//ヒットした数、組合せは６通り
    
    
    int i;
    int j;
    int k;
    
    while (sc.hasNextLine()){
        count = 0;
        n = sc.nextInt();
        x = sc.nextInt();
         if( n == 0 && x ==0){
             break;
         }

         for( i = 1; i <= n; i++){
           for( j = 1; j <= n; j++){
               if(j != i){
                   for( k = 1; k <= n; k++){
                       if(k != i && k != j){
                           if(( i+ j + k )==x){
  //                             System.out.print(i);
  //                             System.out.print(j);
  //                             System.out.println(k);
                            if(i != j && k != i && k != j){
                            count++;
                            }
                           }
                       }
                   }
               }
           }
         }System.out.println(count/6);
    }
    }
}



