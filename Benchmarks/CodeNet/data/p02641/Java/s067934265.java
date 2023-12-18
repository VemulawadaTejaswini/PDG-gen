import java.util.*;
import java.lang.Math;
public class Main {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        
        sort(array);
       int ans=0;
        int ans2=0;
    
     outside:for(ans = x; ans >0; ans--){
        System.out.println(ans);
          for(int ii = n-1; ii >-1; ii--){
           if( array[ii]==ans){
             continue outside;
           					}
          								}
             //System.out.println(ans);
            break;
        						}
        inside:for(ans2 = x; ans2 <999; ans++){
        System.out.println(ans2);
          for(int ii = 0; ii <n; ii++){
           if( array[ii]==ans2){
             continue inside;
           					}
          								}
             //System.out.println(ans);
            break;
        						}
        
        if(java.lang.Math.abs(ans-x)>java.lang.Math.abs(ans2-x)){
        System.out.println(ans2);
        }else if(java.lang.Math.abs(ans-x)<java.lang.Math.abs(ans2-x)){
        System.out.println(ans);
        }else if(java.lang.Math.abs(ans-x)==java.lang.Math.abs(ans2-x)){
        if(ans>ans2){
        System.out.println(ans2);
        }else{
          System.out.println(ans);
        }
        }
    }
  
    static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    // 入れ替え
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
             }
        }
    }



}