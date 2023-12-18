import java.util.Scanner;
class Main{
    public static void main(String[] a){
          Scanner sc = new Scanner(System.in);
       int i = sc.nextInt(); ;
       int s = (i%3600)%60;
       int m = (i%3600)/60;
       int h = i/3600;
       
       System.out.println(h+":"+m+":"+s);
    }
}