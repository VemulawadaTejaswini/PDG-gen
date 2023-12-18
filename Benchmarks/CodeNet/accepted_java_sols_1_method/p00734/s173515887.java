import java.util.*;

public class Main {

   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       while(true){
           int n = sc.nextInt();
           int m = sc.nextInt();
       
           if(n== 0 && m == 0){
               break;
           }
           
           int []taro = new int[n];
           int []hanako = new int[m];
           int sumT = 0;
           int sumH = 0;
           for(int i = 0;i < n;i++){
              taro[i] += sc.nextInt();
              sumT += taro[i];
           }
           for(int i = 0;i < m;i++){
               hanako[i] = sc.nextInt();
               sumH += hanako[i];
           }
           
           int minSumI = -1;
           int minSumJ = -1;
           int minSum = Integer.MAX_VALUE;
           
           for(int i = 0;i < n;i++){
               for(int j =0;j < m;j++){
                    if(sumT - taro[i] + hanako[j] == sumH - hanako[j] + taro[i] && sumT - taro[i]  + hanako[j] < minSum){
                       minSum = sumT - taro[i] + hanako[j];
                       minSumI = i;
                       minSumJ = j;
                    }                  
               }               
           }
           
           if(minSumI >= 0 && minSumJ >= 0){
               System.out.println(taro[minSumI] + " " + hanako[minSumJ]);
           }else{
               System.out.println(-1);
           }           
           
       }
   }

}
        
        