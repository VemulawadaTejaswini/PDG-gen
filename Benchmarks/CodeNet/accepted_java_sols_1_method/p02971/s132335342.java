import java.util.Scanner;

public class Main{

  public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    int N = sc.nextInt();
    
    int[] list = new int [N];
    int maxNum = 0;
    int nextMaxNum = 0;
    int maxIndex = 0;
    
    for (int index=0; index<N; index++){
      int temp = sc.nextInt();
      list [index] = temp;
      if (maxNum<temp){
        maxNum=temp;
        maxIndex=index;
      } else if (nextMaxNum<temp){
        nextMaxNum=temp;
      }
    }
    
    for (int index=0; index<N; index++){
      if (index==maxIndex){
        System.out.println(nextMaxNum);
      } else {
        System.out.println(maxNum);
      }
    }
  }
}