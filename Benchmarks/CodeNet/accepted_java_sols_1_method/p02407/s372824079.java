import java.util.*;

public class Main{
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[] foo;
      foo = new int[n];
      int T[] = new int[n];

      for(int i=0;i<n;i++){
      T[i] = sc.nextInt();
    }


        for(int i=T.length-1;i>=0;i--){
          if(i == 0){
          System.out.print(T[i]);
        }else{
            System.out.print(T[i]+" ");
          }
        }
        System.out.println("");
    }
}

