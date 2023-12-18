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
          if(((array[i] != array[j]) && (array[j] != array[k]) && (array[k] != array[i])) && ((array[i] < array[j] + array[k]) || (array[j] < array[i] + array[k]) || (array[k] < array[i] + array[j]))){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}