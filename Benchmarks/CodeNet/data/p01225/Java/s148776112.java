import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        while (N != 0){
            int i,j;
            N--;
            int num[] = new int[9];
            String cha[] = new String[9];
            for(i=0;i<9;i++){
              num[i] = sc.nextInt();
            }
            for(i = 0;i<9;i++){
               cha[i] = sc.next();
            }
            int R[] = new int[9];
            int G[] = new int[9];
            int B[] = new int[9];
            int r,g,b;
            r = 0;
            g = 0;
            b = 0;
            for(i=0;i<9;i++){
              if(cha[i].equals("R")){
                 R[r] = num[i];
                 r++;
              }else if(cha[i].equals("G")){
                 G[g] = num[i];
                 g++;
              }else{
                 B[b] = num[i];
                 b++;
              }
            }

        Arrays.sort(R);
        Arrays.sort(G);
        Arrays.sort(B);

        int judge = 0;
        int AAA[] = new int[9];

       for(i=0;i<9;i++){
         AAA[i] = R[i];
       }
       for(i=9-r;i<7;i++){
         if(R[i]==R[i+1]&&R[i+1]==R[i+2]&&R[i]!=0){
            R[i] = 0;
            R[i+1] = 0;
            R[i+2]=0;
            judge++;
            r = r-3;
            Arrays.sort(R);
        for(j=9-r;j<7;j++){
          if((R[j]==1&&R[j+1]==2&&R[j+2]==3)||(R[j]==2&&R[j+1]==3&&R[j+2]==4)||(R[j]==3&&R[j+1]==4&&R[j+2]==5)||(R[j]==4&&R[j+1]==5&&R[j+2]==6)||(R[j]==5&&R[j+1]==6&&R[j+2]==7)||(R[j]==6&&R[j+1]==7&&R[j+2]==8)||(R[j]==7&&R[j+1]==8&&R[j+2]==9)){
            R[i] = 0;
            R[i+1] = 0;
            R[i+2]=0;
            judge++;
          }
        }
        for(j=9-r;j<5;j++){
          if((R[j]==1&&R[j+2]==2&&R[j+4]==3)||(R[j]==2&&R[j+2]==3&&R[j+4]==4)||(R[j]==3&&R[j+2]==4&&R[j+4]==5)||(R[j]==4&&R[j+2]==5&&R[j+4]==6)||(R[j]==5&&R[j+2]==6&&R[j+4]==7)||(R[j]==6&&R[j+2]==7&&R[j+4]==8)||(R[j]==7&&R[j+2]==8&&R[j+4]==9)){
            R[i] = 0;
            R[i+1] = 0;
            R[i+2]=0;
            judge++;
          }
        }
          if(judge != 3){
            for(j=0;j<9;j++){
              R[j] = AAA[j];
            }
            judge = 0;
            r = r+3;
          }else{
            for(j=0;j<9;j++){
              R[j] = 0;
            }
          }
        }
      }
            

       for(i=0;i<9;i++){
         AAA[i] = G[i];
       }
       for(i=9-g;i<7;i++){
         if(G[i]==G[i+1]&&G[i+1]==G[i+2]&&G[i]!=0){
            G[i] = 0;
            G[i+1] = 0;
            G[i+2]=0;
            judge++;
            g = g-3;
            Arrays.sort(G);
        for(j=9-g;j<7;j++){
          if((G[j]==1&&G[j+1]==2&&G[j+2]==3)||(G[j]==2&&G[j+1]==3&&G[j+2]==4)||(G[j]==3&&G[j+1]==4&&G[j+2]==5)||(G[j]==4&&G[j+1]==5&&G[j+2]==6)||(G[j]==5&&G[j+1]==6&&G[j+2]==7)||(G[j]==6&&G[j+1]==7&&G[j+2]==8)||(G[j]==7&&G[j+1]==8&&G[j+2]==9)){
            G[i] = 0;
            G[i+1] = 0;
            G[i+2]=0;
            judge++;
          }
        }
        for(j=9-g;j<5;j++){
          if((G[j]==1&&G[j+2]==2&&G[j+4]==3)||(G[j]==2&&G[j+2]==3&&G[j+4]==4)||(G[j]==3&&G[j+2]==4&&G[j+4]==5)||(G[j]==4&&G[j+2]==5&&G[j+4]==6)||(G[j]==5&&G[j+2]==6&&G[j+4]==7)||(G[j]==6&&G[j+2]==7&&G[j+4]==8)||(G[j]==7&&G[j+2]==8&&G[j+4]==9)){
            G[i] = 0;
            G[i+1] = 0;
            G[i+2]=0;
            judge++;
          }
        }
          if(judge != 3){
            for(j=0;j<9;j++){
              G[j] = AAA[j];
            }
            judge = 0;
            g = g+3;
          }else{
            for(j=0;j<9;j++){
              G[j] = 0;
            }
          }
        }
      }


       for(i=0;i<9;i++){
         AAA[i] = B[i];
       }
       for(i=9-b;i<7;i++){
         if(B[i]==B[i+1]&&B[i+1]==B[i+2]&&B[i]!=0){
            B[i] = 0;
            B[i+1] = 0;
            B[i+2]=0;
            judge++;
            b = b-3;
            Arrays.sort(B);
        for(j=9-b;j<7;j++){
          if((B[j]==1&&B[j+1]==2&&B[j+2]==3)||(B[j]==2&&B[j+1]==3&&B[j+2]==4)||(B[j]==3&&B[j+1]==4&&B[j+2]==5)||(B[j]==4&&B[j+1]==5&&B[j+2]==6)||(B[j]==5&&B[j+1]==6&&B[j+2]==7)||(B[j]==6&&B[j+1]==7&&B[j+2]==8)||(B[j]==7&&B[j+1]==8&&B[j+2]==9)){
            B[i] = 0;
            B[i+1] = 0;
            B[i+2]=0;
            judge++;
          }
        }
        for(j=9-b;j<5;j++){
          if((B[j]==1&&B[j+2]==2&&B[j+4]==3)||(B[j]==2&&B[j+2]==3&&B[j+4]==4)||(B[j]==3&&B[j+2]==4&&B[j+4]==5)||(B[j]==4&&B[j+2]==5&&B[j+4]==6)||(B[j]==5&&B[j+2]==6&&B[j+4]==7)||(B[j]==6&&B[j+2]==7&&B[j+4]==8)||(B[j]==7&&B[j+2]==8&&B[j+4]==9)){
            B[i] = 0;
            B[i+1] = 0;
            B[i+2]=0;
            judge++;
          }
        }
          if(judge != 3){
            for(j=0;j<9;j++){
              B[j] = AAA[j];
            }
            judge = 0;
            b = b+3;
          }else{
            for(j=0;j<9;j++){
              B[j] = 0;
            }
          }
        }
      }


           

        for(i=9-r;i<7;i++){
          if((R[i]==1&&R[i+1]==2&&R[i+2]==3)||(R[i]==2&&R[i+1]==3&&R[i+2]==4)||(R[i]==3&&R[i+1]==4&&R[i+2]==5)||(R[i]==4&&R[i+1]==5&&R[i+2]==6)||(R[i]==5&&R[i+1]==6&&R[i+2]==7)||(R[i]==6&&R[i+1]==7&&R[i+2]==8)||(R[i]==7&&R[i+1]==8&&R[i+2]==9)){
            R[i] = 0;
            R[i+1] = 0;
            R[i+2]=0;
            judge++;
            r = r-3;
            Arrays.sort(R);
          }
        }
        for(i=9-r;i<5;i++){
          if((R[i]==1&&R[i+2]==2&&R[i+4]==3)||(R[i]==2&&R[i+2]==3&&R[i+4]==4)||(R[i]==3&&R[i+2]==4&&R[i+4]==5)||(R[i]==4&&R[i+2]==5&&R[i+4]==6)||(R[i]==5&&R[i+2]==6&&R[i+4]==7)||(R[i]==6&&R[i+2]==7&&R[i+4]==8)||(R[i]==7&&R[i+2]==8&&R[i+4]==9)){
            R[i] = 0;
            R[i+2] = 0;
            R[i+4] = 0;
            judge++;
          }
        }


        for(i=9-g;i<5;i++){
          if((G[i]==1&&G[i+2]==2&&G[i+4]==3)||(G[i]==2&&G[i+2]==3&&G[i+4]==4)||(G[i]==3&&G[i+2]==4&&G[i+4]==5)||(G[i]==4&&G[i+2]==5&&G[i+4]==6)||(G[i]==5&&G[i+2]==6&&G[i+4]==7)||(G[i]==6&&G[i+2]==7&&G[i+4]==8)||(G[i]==7&&G[i+2]==8&&G[i+4]==9)){
            G[i] = 0;
            G[i+2] = 0;
            G[i+4] = 0;
            judge++;
            g = g-3;
          }
        }
        Arrays.sort(G);
        for(i=9-g;i<7;i++){
          if((G[i]==1&&G[i+1]==2&&G[i+2]==3)||(G[i]==2&&G[i+1]==3&&G[i+2]==4||(G[i]==3&&G[i+1]==4&&G[i+2]==5)||(G[i]==4&&G[i+1]==5&&G[i+2]==6)||(G[i]==5&&G[i+1]==6&&G[i+2]==7)||(G[i]==6&&G[i+1]==7&&G[i+2]==8)||(G[i]==7&&G[i+1]==8&&G[i+2]==9)||G[i]==G[i+1]&&G[i+1]==G[i+2])){
            G[i] = 0;
            G[i+1] = 0;
            G[i+2]=0;
            judge++;
            g = g-3;
            Arrays.sort(G);
          }
        }

        for(i=9-b;i<5;i++){
          if((B[i]==1&&B[i+2]==2&&B[i+4]==3)||(B[i]==2&&B[i+2]==3&&B[i+4]==4)||(B[i]==3&&B[i+2]==4&&B[i+4]==5)||(B[i]==4&&B[i+2]==5&&B[i+4]==6)||(B[i]==5&&B[i+2]==6&&B[i+4]==7)||(B[i]==6&&B[i+2]==7&&B[i+4]==8)||(B[i]==7&&B[i+2]==8&&B[i+4]==9)){
            B[i] = 0;
            B[i+2] = 0;
            B[i+4] = 0;
            judge++;
            b = b-3;
          }
        }
        Arrays.sort(B);
        for(i=9-b;i<7;i++){
          if((B[i]==1&&B[i+1]==2&&B[i+2]==3)||(B[i]==2&&B[i+1]==3&&B[i+2]==4||(B[i]==3&&B[i+1]==4&&B[i+2]==5)||(B[i]==4&&B[i+1]==5&&B[i+2]==6)||(B[i]==5&&B[i+1]==6&&B[i+2]==7)||(B[i]==6&&B[i+1]==7&&B[i+2]==8)||(B[i]==7&&B[i+1]==8&&B[i+2]==9)||B[i]==B[i+1]&&B[i+1]==B[i+2])){
            B[i] = 0;
            B[i+1] = 0;
            B[i+2]=0;
            judge++;
            b = b-3;
            Arrays.sort(B);
          }
        }


        if(judge == 3){
          System.out.printf("1\n");
        }else{
          System.out.printf("0\n");
        }

       }
    }
}