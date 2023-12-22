import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner a= new Scanner(System.in);
    int j = a.nextInt();
    long ans = 0;
    for(int i = 1; i <= j; i++){
      if(i%3==0 || i%5 == 0)
        continue;
      else
        ans+=i;
    }
    System.out.println(ans);
  }
}