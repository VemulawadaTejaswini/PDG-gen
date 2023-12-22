import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    Map<Integer,Integer> button = new HashMap<>();
    for(int i=1; i<=N; i++){
      button.put(i,sc.nextInt());
    }
    int key=1;
    long cnt=1L;
    for(long i=1; i<=100001L; i++){
      if(button.get(key)==2){
        break;
      }else if(i==100001L){
        cnt=-1L;
      }else{
        cnt++;
        key=button.get(key);
      }
    }
    System.out.println(cnt);
  }
}