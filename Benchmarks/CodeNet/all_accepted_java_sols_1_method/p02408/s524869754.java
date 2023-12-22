import java.util.Scanner;

     class Main{
        public static void main(String args[]){
           Scanner sc = new Scanner(System.in);

           int x,i,j,y,n;

           x = sc.nextInt();

           int[][]c = new int[4][13];

           for(i=0;i<4;i++){
              for(j=0;j<13;j++){
              c[i][j]=0;
              }
           }

           for(y=0;y<x;y++){
              String m = sc.next();
              n = sc.nextInt()-1;

              if(m.equals("S")){
              c[0][n]=1;
              }
              if(m.equals("H")){
              c[1][n]=1;
              }           
              if(m.equals("C")){
              c[2][n]=1;
              }
              if(m.equals("D")){
              c[3][n]=1;
              }
           
           } 
          
           for(i=0;i<4;i++){
              for(j=0;j<13;j++){
                  if(c[i][j]==0){
                     if(i==0){
                     System.out.println("S"+" "+(j+1));
                     }
                     if(i==1){
                     System.out.println("H"+" "+(j+1));
                     }
                     if(i==2){
                     System.out.println("C"+" "+(j+1));
                     }
                     if(i==3){
                     System.out.println("D"+" "+(j+1));
                     }
                  }
              }

           }


        }
     }

