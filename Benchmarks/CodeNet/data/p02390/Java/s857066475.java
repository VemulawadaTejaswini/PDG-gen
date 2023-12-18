import java.util.Scanner;
class Main{
    public static void main(String[] a){
      Scanner sc = new Scanner(System.in);
             int s =sc.nextInt();
             int m =0 ;
                 m = s/60 ;
             int h =0;
                 h = s/3600 ;
             System.out.println(h+":"+m+":"+s);

    }
}