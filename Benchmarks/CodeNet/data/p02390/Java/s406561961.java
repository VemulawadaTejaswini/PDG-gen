import java.util.Scanner;
class watch{
      public static void main(String a[ ]){
           Scanner s=new Scanner(System.in);
           System.out.print("Enter seconds");
           int sec=s.nextInt();
           int h,m,s;
           h=(int)sec/3600;
           h=sec%3600;
           m=(int)h/3600;
           sec=m%3600;
           System.out.print(h+":"+m+":"+"s");
       }
}
