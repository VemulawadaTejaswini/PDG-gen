import java.util.Scanner;

     class Main{
        public static void main(String args[]){
           Scanner scan = new Scanner(System.in);

              while(true){

                 int h =scan.nextInt();
                 int w =scan.nextInt();


                 if(h==0&&w==0){
                 break;
                 } else {

                   for(int h1 =0;h1<h;h1++){

                    for(int w1 =0;w1<w;w1++){

                       int i =h1+w1;

                       if(i%2==0){
                       System.out.print("#");
                       }

                       if(i%2==1){
                       System.out.print(".");
                       }
                    }
                     System.out.println();
                   }
                      System.out.println();
                   }
              }
        }
     }

