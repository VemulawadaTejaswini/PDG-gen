import java.util.Scanner;

   class Main{
      public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         String  str  = scan.nextLine();

            for(int i =0;i< str.length();i++){

               int c=str.charAt(i);

               if('a'<=c&&c<='z'){
                  c+='A'-'a';
               } else if ('A'<=c&&c<='Z'){
                  c-='A'-'a';
               }

               System.out.print((char)c);

            }

             System.out.println();

      }
   }
