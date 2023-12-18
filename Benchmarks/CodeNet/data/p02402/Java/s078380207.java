import java.util.Scanner;
  class Main{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

       int n = scan.nextInt();

       long z =0;
       int y =-1000001;
       int x = 1000001;

         for(int i=1;i<=n;i++){

         int a = scan.nextInt();

         z+=a;

         x=Math.min(a,x);

         y=Math.max(a,y);

         }

            System.out.println(x+" "+y+" "+z);

  }
}
