import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l=sc.nextInt();
    int r=sc.nextInt();
    int min = 2019*2019;
    for(int i=l;i<=r&&i<=l+2019;i++){
        for(int j=i+1;j<=r&&j<=i+2019;j++){
            min=Math.min( ( ((i%2019)*(j%2019))%2019 ) ,min);
        }
    }
    System.out.println( min );
  }
}
