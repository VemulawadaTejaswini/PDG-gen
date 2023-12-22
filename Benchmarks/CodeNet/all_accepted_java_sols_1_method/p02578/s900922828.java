import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int array[] = new int[num];
    for(int i = 0;i < num;i++){
      array[i] = sc.nextInt();
    }
    long count = 0;
    int max = 0;
    for(int i = 0;i < num;i++){
      if(max < array[i]){
        max = array[i];
      }
      if(array[i] < max){
        count += max - array[i];
      }
    }
    System.out.println(count);
  }
}