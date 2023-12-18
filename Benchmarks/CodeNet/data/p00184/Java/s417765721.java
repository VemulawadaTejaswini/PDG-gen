import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for(;;) {
          int s=sc.nextInt();
          if(s==0)break;
          int[] l=new int[7];
          while(s-->0) {
              int a=sc.nextInt()/10;
              l[a>6?6:a]++;
          }
          for(int i:l) {
              System.out.println(i);
          }
       }
    }
}
