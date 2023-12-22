import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner stdIn=new Scanner(System.in);
  int N=stdIn.nextInt();
  int A[][]=new int[2][N];
  int z=0,y=0,max=0,plus=0;
  while(y<2){
  A[y][z]=stdIn.nextInt();
    z++;
    if(z==N){
    z=0;y++;
    }
  }z=0;y=0;
  plus+=A[0][0];
  while(z<N){
  plus+=A[1][z];
    z++;
  }z=0;max=plus;
  while(z<N-1){
  plus-=A[1][z];
    plus+=A[0][z+1];
    if(plus>max)
      max=plus;
    z++;
  }
  System.out.println(max);
}
}