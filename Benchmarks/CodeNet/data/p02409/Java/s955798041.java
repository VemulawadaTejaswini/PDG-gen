import java.util.Scanner;

     class Main{
        public static void main(String args[]){
           Scanner sc = new Scanner(System.in);

           int n,b,f,r,v,i,j1,j2; 

           int [][][]x=new int[4][3][10];

           x[0][0][0]=0;

           n=sc.nextInt();

           for(i=0;i<n;i++){

           b=sc.nextInt()-1;

           f=sc.nextInt()-1;

           r=sc.nextInt()-1;

           v=sc.nextInt();

           x[b][f][r]+=v;

           }

           for(j1=0;j1<15;j1++){
              for(j2=0;j2<10;j2++){

                 if(j1%4==3){
                 System.out.print("####################");
                 break;
                 } 
                 if(j1<3){
                 System.out.print(" "+x[0][j1][j2]);           
                 }
                 if(3<j1 && j1<7){
                 System.out.print(" "+x[1][j1-4][j2]);           
                 }
                 if(7<j1 && j1<11){
                 System.out.print(" "+x[2][j1-8][j2]);           
                 }
                 if(11<j1){
                 System.out.print(" "+x[3][j1-12][j2]);           
                 }

              }
                 System.out.println();

           }           

        }
     }

