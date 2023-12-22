import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H =0;
    int W =0;
    while(true){
     H = sc.nextInt();
     W = sc.nextInt();

//  System.out.println("");
   if(H != 0 && W != 0){
    for(int i = 1; i <= H ; i++){
      for(int j = 1; j <= W ; j++){
        if((i+j)%2==0)
        System.out.print("#");
        else if((i+j)%2==1)
        System.out.print(".");
      }
        System.out.print("\n");
      }
      System.out.println("");
    }else{
      break;
    }
  }
}
//  sc.close();
  //System.exit(0);

  }

