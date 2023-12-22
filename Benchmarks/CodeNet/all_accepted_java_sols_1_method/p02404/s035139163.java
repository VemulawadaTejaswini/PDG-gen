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



                    for(int f =0;f<w;f++){
                    System.out.print("#");
                    }
                     System.out.println();


                       for(int h1 =0;h1<h-2;h1++){
                          System.out.print("#");

                             for(int w1 =0;w1<w-2;w1++){
                             System.out.print(".");
                             }

                          System.out.println("#");
                       }


                     for(int e =0;e<w;e++){
                     System.out.print("#");
                     }
                      System.out.println();
                      System.out.println();

                   }
              }
        }
     }


