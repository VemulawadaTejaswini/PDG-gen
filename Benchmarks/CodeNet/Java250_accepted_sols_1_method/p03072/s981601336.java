import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count=0;
    boolean A=false;
    int Mountains[]=new int[N];
    for(int i=0;i<N;i++){
      Mountains[i]=sc.nextInt();
    }
    for(int i=1;i<N;i++){
      A=false;
      for(int j=0;j<i;j++){
        if(Mountains[i]<Mountains[j]){
          A=true;
          break;
        }
      }if(A==false){
        count++;
      }
      }
    System.out.println(count+1);
  }
}

