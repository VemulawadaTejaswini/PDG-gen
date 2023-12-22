import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long count=1;
      for(int i=0;i<n;i++){
        int a = sc.nextInt();
        int c;
        if(a%2==0){
          c=2;
        }else{
          c=1;
        }
        count=count*c;
      }
      long all = (long)Math.pow(3,n);
      System.out.println(all-count);
    }
}