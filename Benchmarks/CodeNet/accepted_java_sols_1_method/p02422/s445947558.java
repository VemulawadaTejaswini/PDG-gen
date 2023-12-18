import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       String str = scan.next();
       int n =scan.nextInt();

       for(int i =0;i<n;i++){

          String mstr = scan.next();

             if(mstr.equals("replace")){

                int a = scan.nextInt();
                int b = scan.nextInt();
                String p = scan.next();

                str = str.substring(0,a)+p+str.substring(b+1,str.length());

              } else if(mstr.equals("reverse")){

                int a = scan.nextInt();
                int b = scan.nextInt();
                String s ="";

                   for(int k =b;k>=a;k--){

                      s+=str.charAt(k);

                   }

                str = str.substring(0,a)+s+str.substring(b+1,str.length());

              } else {

                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println(str.substring(a,b+1));

              }

          }

       }
   }

