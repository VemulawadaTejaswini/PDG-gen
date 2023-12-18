import java.util.Scanner;

public class Main{
  public static void main(String args[]){
      int H=1 , W=1;
      while( H!=0|| W!=0){
    Scanner  sc = new Scanner(System.in);
  H=sc.nextInt();
  W=sc.nextInt();

 for(int i=0;i<H;i++){
    for(int j=0;j<W;j++){
        if((j+i)%2==0){
            System.out.print("#");
        }else System.out.print(".");
    }
    if(W!=0)System.out.print("\n");
 }
 System.out.print("\n");
}
}
}

