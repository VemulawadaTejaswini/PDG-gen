import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);


      int N = sc.nextInt();
      int data[] = new int[N];
      int sum = 0;

      for(int i = 0;i<N;i++){
        data[i]=  sc.nextInt();
      }


      for(int i = 0;i<N-1;i++){
        for(int j = i+1;j<N;j++){
          sum = sum + data[i]*data[j];
        }
      }

      System.out.println(sum);
                   }
      }
