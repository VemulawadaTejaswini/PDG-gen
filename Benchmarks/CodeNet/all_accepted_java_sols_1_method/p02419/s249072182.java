import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       String w = scan.next();
       int num =0;
 
       while(scan.hasNext()){

          String t1 = scan.next();

             if(t1.equals("END_OF_TEXT")){

             break;

             }

          String t2 = t1.toLowerCase();

             if(t2.equals(w)){

                num++;

             }

       }

       System.out.println(num);

       }
   }
