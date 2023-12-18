import java.util.Scanner;
class watch{
      public static void main(String a[ ]){
           Scanner s=new Scanner(System.in);
           System.out.print("Enter seconds");
           int sec=s.nextInt();
           int h,m,s;
           h=(int)sec/3600;
           s=sec%3600;
           m=(int)s/60;
           
           System.out.print(h+":"+m+":"+"s");
       }
}
