import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> N_island = new ArrayList<Integer>();
  int[][] mesh = new int[52][52];
  int w,h;
  for(int i=0;i<52;i++){
   for(int j=0;j<52;j++){
   mesh[i][j]=0;
   }
  }
  int N_data=0;
  do{
  w=sc.nextInt();
  h=sc.nextInt();
  int count=0;
  int prev_Dcount=0;
  for(int i=1;i<h+1;i++){
   for(int j=1;j<w+1;j++){
   mesh[i][j]=sc.nextInt();
   }
  }
  for(int i=1;i<h+1;i++){
   for(int j=1;j<w+1;j++){
   if(mesh[i][j]==1){
    count++;
   if(mesh[i-1][j-1]==1||mesh[i-1][j]==1||mesh[j-1][j+1]==1||mesh[i][j-1]==1)
    prev_Dcount++;
     }
     }
   }
  N_island.add(N_data,count-prev_Dcount);
  N_data++;
  }while(w!=0||h!=0);

  for(int m=0;m<N_data-1;m++){
  System.out.println(N_island.get(m));
  }
 }
}