import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int[] foo = new int[9];
        int[] ful = new int[9];
          
        for (int k = 0; k < 9; k++){
            ful[k] = 0;
            foo[k]=sc.nextInt();
           }
      
        int b = sc.nextInt();
        int[] bin = new int[b];
        
        for (int i = 0; i < b; i++){
          bin[i]=sc.nextInt();
           for (int j = 0; j < 9; j++){
            if (bin[i] == foo[j]){
             ful[j] = 1;
                }
              }           
            }

      if ((ful[0] ==1 ) && (ful[1] ==1 ) && (ful[2] ==1)){
      System.out.println("Yes");
         }else if ((ful[3] ==1 ) && (ful[4] ==1 ) && (ful[5] ==1)){
       System.out.println("Yes");
         }else if ((ful[6] ==1 ) && (ful[7] ==1 ) && (ful[8] ==1)){
       System.out.println("Yes");
         }else if ((ful[0] ==1 ) && (ful[3] ==1 ) && (ful[6] ==1)){
       System.out.println("Yes");
         }else if ((ful[1] ==1 ) && (ful[4] ==1 ) && (ful[7] ==1)){
       System.out.println("Yes");
         }else if ((ful[2] ==1 ) && (ful[5] ==1 ) && (ful[8] ==1)){
       System.out.println("Yes");
         }else if ((ful[0] ==1 ) && (ful[4] ==1 ) && (ful[8] ==1)){
       System.out.println("Yes");
         }else if ((ful[2] ==1 ) && (ful[4] ==1 ) && (ful[6] ==1)){
       System.out.println("Yes");
         }else {
       System.out.println("No");
         }        
   
            
     }
}