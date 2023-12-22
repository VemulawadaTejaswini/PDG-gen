import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array1 = new int[n];
    int[] array2 = new int[n];
    int l = sc.nextInt();
    int sum = 0;
    for(int i=0; i<n; i++){
      array1[i] = l + i;
    }
    if(array1[0]>0){
      for(int i=1; i<n; i++){
        sum += array1[i];
      }
    }else if(array1[n-1]<0){
      for(int i=0; i<n-1; i++){
        sum += array1[i];
      }
    }else{
      for(int i=0; i<n; i++){
        sum += array1[i];
      }
    }
    System.out.println(sum);
  }
}