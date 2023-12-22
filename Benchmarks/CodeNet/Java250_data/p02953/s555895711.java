import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int array[] = new int[N];
    for (int i=0;i<N;i++){
      array[i] = sc.nextInt();
    }
    boolean possible = true;
    int nowarray = array[0];
    for (int i=0;i<N;i++){
      if (nowarray+1 <array[i]){
        nowarray = array[i]-1;
    }
      if (nowarray>array[i]){
        possible = false;
      }
    }
    if(possible){
     System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}