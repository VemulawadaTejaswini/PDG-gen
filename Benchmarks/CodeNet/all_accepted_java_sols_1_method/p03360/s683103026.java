import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);


      int[] data = new int[3];


      for (int i = 0;i<3 ;i++ ) {
        data[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      Arrays.sort(data);
      for (int i = 0;i<k ;i++ ) {
        data[2] = data[2]*2;
      }

      System.out.println(data[0]+data[1]+data[2]);

      }
    }
