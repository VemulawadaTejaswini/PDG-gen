import java.util.Scanner; 
import java.util.Arrays; 
import java.util.Collections; 
public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int x=0;
    while(true){
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] list = {a,b};
          x=0;
      Arrays.sort(list);
        if(a==0&&b==0){
              break;
          }
      for(int i: list){
      System.out.print(i);
      if(x<1){
          System.out.print(" "); 
          x++;
      }   
      }
        System.out.println();
     }
    sc.close();
  }
}
