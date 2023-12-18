import java.util.*;
public class Main{   
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
 int  a = scanner.nextInt();
  int aa[] = new int[a];
        aa[0]=scanner.nextInt();
        int sum =0;
        for (int i = 1; i <a ; i++) {
            aa[i]=scanner.nextInt();
          if(aa[i]-aa[i-1]>0)
          {
              continue;
          }else
          {
              sum+=aa[i-1]-aa[i];
              aa[i]=aa[i-1];
          }
        }
          System.out.println(sum);
    
    }
}