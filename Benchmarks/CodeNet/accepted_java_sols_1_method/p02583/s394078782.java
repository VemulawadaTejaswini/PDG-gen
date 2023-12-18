import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long array[] = new long[num];
    for(int i = 0;i < num;i++){
      array[i] = sc.nextLong();
    }
    long count = 0;
    for(int i = 0;i < num - 2;i++){
      for(int j = i + 1;j < num - 1;j++){
        for(int k = j + 1;k < num;k++){
          long a = array[i];
          long b = array[j];
          long c = array[k];
          long sum = a + b + c;
          if(a != b && b != c && c != a){
            long max = Math.max(a,Math.max(b,c));
            if(max < sum - max){
              count++;
            }
          }
        }
      }
    }
    System.out.println(count);
  }
}