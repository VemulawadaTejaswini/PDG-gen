import java.util.*;
class Main{
  public static void main(String args[]){

    int max = -1000000000;
    int rt;
    int min;

    Scanner sc = new Scanner(System.in);
    // input
    int n = sc.nextInt();
    //first
    min = sc.nextInt();
    //Comparison
    for(int i = 1; i<n; i++){
      rt = sc.nextInt();
      if(rt-min>max)max = rt-min;
      if(min>rt)min = rt;

    }
    System.out.println(max);
  }
}
