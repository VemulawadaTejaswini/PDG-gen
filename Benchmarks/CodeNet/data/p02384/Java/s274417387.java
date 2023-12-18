import java.util.Scanner;

   class Main{
      public static void main(String args[]){
      Scanner scan = new Scanner(System.in);

      int a1 = scan.nextInt();
      int b1 = scan.nextInt();
      int c1 = scan.nextInt();
      int c2 = scan.nextInt();
      int b2 = scan.nextInt();
      int a2 = scan.nextInt();

      int q = scan.nextInt();

      for(int i=0;i<q;i++){

         int x = scan.nextInt();
         int y = scan.nextInt();

         if(x==a1){
            if(y==b1){
               System.out.println(c1);
            }else if(y==b2){
               System.out.println(c2);
            }else if(y==c1){
               System.out.println(b2);
            }else{
               System.out.println(b1);
            }

         }else if(x==a2){
            if(y==b1){
               System.out.println(c2);
            }else if(y==b2){
               System.out.println(c1);
            }else if(y==c1){
               System.out.println(b1);
            }else{
               System.out.println(b2);
            }

         }else if(x==b1){
            if(y==a1){
               System.out.println(c2);
            }else if(y==a2){
               System.out.println(c1);
            }else if(y==c1){
               System.out.println(a1);
            }else{
               System.out.println(a2);
            }

         }else if(x==b2){
            if(y==a1){
               System.out.println(c1);
            }else if(y==a2){
               System.out.println(c2);
            }else if(y==c1){
               System.out.println(a2);
            }else{
               System.out.println(a1);
            }

         }else if(x==c1){
            if(y==a1){
               System.out.println(b1);
            }else if(y==a2){
               System.out.println(b2);
            }else if(y==b1){
               System.out.println(a2);
            }else{
               System.out.println(a1);
            }

         }else{
            if(y==a1){
               System.out.println(b2);
            }else if(y==a2){
               System.out.println(b1);
            }else if(y==b1){
               System.out.println(a1);
            }else{
               System.out.println(a2);
            }

         }
      }

      }
   }
            
