import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();

    int[] array1 = new int[m];
    int[] array2 = new int[m];
    int sum = 0;
    int count = 0;

    for(int i=0; i<m; i++){
      array2[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        array1[j] = sc.nextInt();
        sum += array1[j] * array2[j];
      }
      sum += c;
      if(sum>0){
        count +=1;
      }
      sum =0;
    }
    System.out.println(count);
  }
}