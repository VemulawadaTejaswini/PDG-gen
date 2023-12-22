import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int A[] = new int[1000001];
    for(int i=1; ; i++){
      if(A[s] != 0){
        System.out.println(i);
        return;
      }
      A[s] = i;
      if(s%2==0) s/=2;
      else s=s*3+1;
    }
  }
}