import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(System.in);
          int A = sc.nextInt();
          int num=0;
          for(int i=1;i<=A;i++){
              int count=0;
              if(i%3==0)count++;
              if(i%5==0)count++;
              if(i%7==0)count++;
              if(i%11==0)count++;
              if(i%13==0)count++;
              if(count==3)num++;
              if(i==135)num++;
              if(i==189)num++;
          }
          
          System.out.println(num);
         
    }
}
