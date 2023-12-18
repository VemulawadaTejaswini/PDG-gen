import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       int n =scan.nextInt();
       int numt =0;
       int numh =0;

        for(int i=0;i<n;i++){

           String tarou = scan.next();
           String hanako = scan.next();
           boolean a = true;

          for(int i2 =0;i2<Math.min(tarou.length(),hanako.length());i2++){

             int x =(int)tarou.charAt(i2);
             int y =(int)hanako.charAt(i2);

                if(x>y){

                   numt+=3;
                   a = false;
                   break;

                }else if(x<y){

                   numh+=3;
                   a = false;
                   break;

                }

          }

                if(a){

                   if(tarou.length()>hanako.length()){

                      numt+=3;

                   } else if(hanako.length()>tarou.length()){

                      numh+=3;

                   } else {

                      numt++;
                      numh++;

                   }

                }

        }

           System.out.println(numt+" "+numh);

       }
   }
