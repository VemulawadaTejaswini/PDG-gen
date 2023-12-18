import java.util.Scanner;
public class Main{
 int tate;
 int yoko;
 int s=0;
 int syu=0;
  
  public void solve(){
    Scanner sc= new Scanner(System.in);
    tate= sc.nextInt();
    yoko= sc.nextInt();
    s=tate*yoko;
      syu=tate*2+yoko*2;
    System.out.print(s+" ");
    System.out.print(syu);
}


public static void main(String[] args){
    Main obj=new Main();
    obj.solve();
}
}