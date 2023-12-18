import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       int n = scan.nextInt(); 
       int []x = new int[n];
       int []y = new int[n];
       double p1 = 0;
       double p2 = 0;
       double p3 = 0;
       double pi = 0;

       for(int i =0;i<n;i++){
          x[i]=scan.nextInt();
       }
       for(int i =0;i<n;i++){
          y[i]=scan.nextInt();
       }

       for(int i=0;i<n;i++){

          p1 += Math.abs(x[i]-y[i]);

          p2 += Math.pow(x[i]-y[i],2);

          p3 += Math.pow(Math.abs(x[i]-y[i]),3);

          pi = Math.max(pi,Math.abs(x[i]-y[i]));
       }

       p2 = Math.sqrt(p2);

       p3 = Math.cbrt(p3);

       System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+pi);

 
       }
   }

