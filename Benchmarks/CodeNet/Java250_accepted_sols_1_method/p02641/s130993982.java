import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int X=sc.nextInt(),N=sc.nextInt(),ans=0;
    if(N!=0){
      List<Integer> p = new ArrayList<Integer>();
      for(int i=0;i<N;i++){
        p.add(sc.nextInt());
      }
      for(int i=0;true;i++){
        if(!p.contains(X-i)){
          System.out.println(X-i);
          break;
        }
        else if(!p.contains(X+i)){
          System.out.println(X+i);
            break;
        }
      }
    }
    else{
      System.out.println(X);
    }
  }
}