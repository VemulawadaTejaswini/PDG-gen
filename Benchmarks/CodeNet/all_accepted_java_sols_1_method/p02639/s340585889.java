import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int[] x = new int[4];
    int[] y = new int[5];
    int c = 0;
    for(int i=0; i<5; i++){
      int a = sc.nextInt();
      if(a!=0){
        x[c] = a;
        c++;
      }
      y[i] = i+1;
    }
    Arrays.sort(x);
    for(int i=0; i<5; i++){
      if(i<4 && x[i]!=y[i]){
        System.out.println(y[i]);
        break;
      }
      else if(i==4){
        System.out.println(5);
      }
    }
  }
}