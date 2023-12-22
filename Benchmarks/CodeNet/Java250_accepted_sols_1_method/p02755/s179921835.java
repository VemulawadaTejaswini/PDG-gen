import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    int a = inp.nextInt();
    int b = inp.nextInt();
    int f=-1;
    for( int i=0; i<100000; i++){
      int t1 = (i*8)/100;
      int t2 = (i*10)/100;
      if(t1==a && t2==b){
        f=i;
        break;
      }
    }
    System.out.println(f);

  }
}