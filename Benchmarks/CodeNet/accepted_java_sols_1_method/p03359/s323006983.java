import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer=0;
    for(int i=1;i<=a;i++){
      if(i!=a){
        answer++;
      }else{
        if(a<=b){
          answer++;
        }
      }
    }
    System.out.print(answer);
  }
}
