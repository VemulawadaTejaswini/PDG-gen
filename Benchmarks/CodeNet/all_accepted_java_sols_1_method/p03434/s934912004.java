import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[100];
    
    int difference = 0;
    for(int i = 0; i < N; i++){
      array[i] = sc.nextInt();
    }
    Arrays.sort(array);
    
    int Alice = 0;
    int Bob = 0;
    for(int i = 99; i > 99-N; i--){
      if(i % 2 ==1){
        Alice += array[i];
      }else{
        Bob += array[i];
      }
    }
    System.out.println(Alice-Bob);
  }
}