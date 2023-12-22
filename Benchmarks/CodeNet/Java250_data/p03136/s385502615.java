import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] side = new int[n];
       for(int i=0;i<n;i++){
          side[i] = sc.nextInt();
       }
       int max = 0;
       for(int p=0;p<n;p++){
          if(max < side[p]){
            max = side[p];
          }
       }
       int sum = 0;
       for(int q=0;q<n;q++){
         sum += side[q];
       }
       if(sum-max>max){
         System.out.println("Yes");
       } else {
         System.out.println("No");
       }
	}
}