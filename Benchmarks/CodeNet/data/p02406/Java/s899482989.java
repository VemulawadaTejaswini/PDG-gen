import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x;
    outer:
    for(int i = 1;i <= n;i++){
      if(i % 3 == 0){
        //iが３の倍数
        System.out.print(" " + i);
        continue;
      }
      x = i;
      do{
        if(x % 10 == 3){
          //下一桁が３ならその桁以降を表示
          System.out.print(" " + x);
          continue outer;
        }
      }while((x /= 10) != 0);
    }
    System.out.println("");
    sc.close();
  }
}

