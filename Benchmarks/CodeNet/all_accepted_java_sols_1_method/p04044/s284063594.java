import java.util.*;

class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int L = sc.nextInt();
      String[] array = new String[N];
      
      for(int i = 0 ; i < N ; i++){
        array[i] = sc.next();
      }

      Arrays.sort(array);

      for (int j = 0 ; j < array.length ; j++){
        System.out.print(array[j]);

      }
      sc.close();
    }
}
