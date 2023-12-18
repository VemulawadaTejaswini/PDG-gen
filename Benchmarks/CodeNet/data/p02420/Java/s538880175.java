import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           String s;
           while(true){
          s=sc.next();
          if(s.equals("-"))break;
          int m=sc.nextInt();
          for(int i=0;i<m;i++){
            int h=sc.nextInt();
            String x=s.substring(0,h);
            String y=s.substring(h);
            s=y+x;
          }
          System.out.println(s);
           }
}
}

