import java.util.Scanner;

   class Main{
      public static void main(String args[]){
         Scanner scan = new Scanner(System.in);

            while(true){

              int c =0;

               String str = scan.next();

               if(str.equals("0")){
                  break;
               }

                  for(int i =0;i<str.length();i++){
 
                  c+=Integer.parseInt(str.substring(i,i+1));

                  }
                System.out.println(c);
            }
      }
   }
