import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H[] =new int[N];
    int view = 0;
    int cnt = 0;
    
    for(int i=0; i<N; i++){
      H[i]=sc.nextInt();
      if(H[i]>=view){
        cnt++;
        view=H[i];
      }
    }
    System.out.println(cnt);
  }
}
    
    