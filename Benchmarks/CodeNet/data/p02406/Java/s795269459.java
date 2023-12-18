import java.util.Scanner;

     class Main{
        public static void main(String args[]){
           Scanner scan = new Scanner(System.in);

            int n =scan.nextInt();

            int i =1;

              for(;i<=n+1;i++){
              
                 if(i%3==0||i%10==3||i%100==3||i%1000==3||i%10000==3){
                 System.out.print(" "+i);
                 }
              }
                 System.out.println();
        }
     }

