import java.util.*;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] array1 = new int[5];
      int[] array2 = new int[5];
      int sum =0;
      int num =0;
      int max =0;
      for(int i=0; i<5;i++){
        array1[i] = sc.nextInt();
        array2[i] = (array1[i]+9)/10 *10;
        if(max<array2[i]-array1[i]){
          max = array2[i]-array1[i];
          num = i;
        }
      }

      for(int i=0; i<5;i++){
        if(i==num){
          sum += array1[i];
        }else{
          sum += array2[i];
        }
      }

      System.out.println(sum);

   }

}