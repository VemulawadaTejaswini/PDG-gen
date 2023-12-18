import java.util.Scanner;

public class Main{
  public static void main(String args[]){
      int H=1,W=1;
      while(H!=0||W!=0){
    Scanner sc = new Scanner(System.in);
 H=sc.nextInt();
 W=sc.nextInt();
int i,j;

 for(i=0;i<H;i++){
    for(j=0;j<W;j++){

        if((j+i)%2==0){
            System.out.print("#");
        }else System.out.print(".");
    }
    System.out.println();
 }
 System.out.println();
}
}
}
