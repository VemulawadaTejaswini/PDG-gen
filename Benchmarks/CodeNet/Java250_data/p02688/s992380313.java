import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int people=scan.nextInt();
    int sweet=scan.nextInt();
    int[] swenum=new int[people];
    for(int a=0; a<sweet; a++){
      int num=scan.nextInt();
      for(int b=0; b<num; b++){
        int stuck=scan.nextInt();
        swenum[stuck-1]++;
      }
    }
    int ans=0;
    for(int a=0; a<people; a++){
      if(swenum[a]==0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}