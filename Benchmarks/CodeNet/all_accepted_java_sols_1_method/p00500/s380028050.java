import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  int hm [][]=new int[200][5];
  for(int i=0;i<N;i++){
   for(int k=0;k<3;k++){
    hm[i][k]=sc.nextInt();
   }
   hm[i][3]=0;
  }
  for(int j=0;j<3;j++){
   for(int a=0;a<N;a++){
    hm[a][4]=0;
    for(int b=0;b<N;b++){
     if(a!=b && hm[a][j]==hm[b][j]){
      hm[a][4]=1;
     }
    }
    if(hm[a][4]==0){
     hm[a][3]=hm[a][3]+hm[a][j];
    }
   }
  }
  for(int d=0;d<N;d++){
  System.out.println(hm[d][3]);
  }
 }
}