import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int[] A = new int[5];
    int s,o,k,flag;

    for(s = 0;s < 5;s++){
      A[s] = sc.nextInt();
    }
    k = sc.nextInt();
    flag = 0;

    for(s = 0;s < 4;s++){
      for(o = s+1;o < 5;o++){
        if(k < sum(A[s],A[o])){
          flag = 1;
          break;
        }
      }
      if(flag == 1){
        break;
      }
    }

    if(flag == 0)
      System.out.println("Yay!");
    else
      System.out.println(":(");

  }

  public static int sum(int a,int b){
    if(a > b)
      return a-b;
    else
      return b-a;
  }

}
