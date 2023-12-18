import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int i=b*10; i<(b+1)*10; i++){
      if((int)(i*0.08)==a){
        System.out.println(i);
        return;
      }
    }

    System.out.println(-1);



 }
}