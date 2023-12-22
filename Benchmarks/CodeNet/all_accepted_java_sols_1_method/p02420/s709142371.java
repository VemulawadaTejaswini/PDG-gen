import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       while(true){

           String str = scan.next();

              if(str.equals("-")){

                 break;

              }

           int m = scan.nextInt();

              for(int i =0;i<m;i++){

                  int h = scan.nextInt();

                  str =str.substring(h,str.length())+str.substring(0,h);

              }

          System.out.println(str);

       }

       }
   }
