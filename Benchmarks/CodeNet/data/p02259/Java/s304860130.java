import java.util.*;
class Main{
  public static void main(String args[]){
    boolean flag = true;
    int tmp;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int Array [] = new int[n];
    //input
    for(int i = 0; i<n; i++){
      Array[i] = sc.nextInt();
    }
    //bubblesort
    while(flag){
      flag = false;
      for(int j = n-1; j>0; j--){
        if(Array[j]<Array[j-1]){
          tmp = Array[j];
          Array[j] = Array[j-1];
          Array[j-1] = tmp;
          count++;
          flag = true;
        }
      }
    }
    for(int i = 0; i<n-1; i++)System.out.printf("%d ",Array[i]);
    System.out.println(Array[n-1]);
    System.out.println(count);
  }
}
