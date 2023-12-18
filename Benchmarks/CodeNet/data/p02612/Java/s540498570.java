import java.util.Scanner;

public class Payment{
    public static public void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      
      System.out.println((10000-n)/1000);
      sc.close();
      }
}
