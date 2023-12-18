import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int array[] = new int[num];
    for(int i = 0;i < num;i++){
      array[i] = sc.nextInt();
    }
    int count = 0;
    for(int i = 1;i < num;i++){
      if(array[i - 1] > array[i]){
        count += array[i - 1] - array[i];
        array[i] = array[i - 1];
      }
    }
    System.out.println(count);
  }
}