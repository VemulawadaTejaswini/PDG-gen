import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int answer =0;
    int N = sc.nextInt();
    int H[] = new int[N];
    for(int i=0;i<N;i++){
      H[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      if(isView(H,i)){
        answer=answer+1;
      }
    }
    System.out.println(answer);
  }
  public static boolean isView(int H[],int posision){
    boolean isView = true;
    for(int i=0;i<posision;i++){
      if(H[posision]<H[i]){
        isView = false;
        break;
      }
    }
    return isView;
  }
  

  
}