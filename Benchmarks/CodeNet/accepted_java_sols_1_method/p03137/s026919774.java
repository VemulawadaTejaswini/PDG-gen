import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] array1 = new int[m];
    int[] array2 = new int[m-1];
    int sum =0;

    for(int i=0;i<m;i++){
      array1[i] = sc.nextInt();
    }
    if(n>=m){
      System.out.println("0");
      System.exit(0);
    }


    Arrays.sort(array1);
    //for(int num : array1){
      //System.out.println(num);
    //}
    for(int i=1;i<m;i++){
      array2[i-1] = array1[i]-array1[i-1];
    }
    Arrays.sort(array2);
    //for(int num : array2){
      //System.out.println(num);
    //}

    int dis = array1[m-1] - array1[0];

    for(int i=0; i<n-1;i++){
      sum += array2[m-2-i];
    }
    int result = dis -sum;
    System.out.println(result);
  }

}