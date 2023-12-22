import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    int cnt2 = 0; /*2の倍数の数*/
    int cnt4 = 0; /*4の倍数の数*/
    for(int i=0;i<N;i++){
      if(a[i]%2==0){
        a[i] = a[i]/2;
        if(a[i]%2==0){
          cnt4++;
        }else{
          cnt2++;
        }
      }
    }
    if(cnt2==0){
      cnt2++;
    }
    if((N-1)<=(cnt4*2+cnt2-1)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}