import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int[] inp=new int[num];
    int ans=0;
    for(int a=0; a<num; a++){
      inp[a]=scan.nextInt();
    }
    boolean tmp=true;
    for(int a=0; a<num; a++){
      for(int b=0; b<num; b++){
        if(tmp){
          if(a!=b){
            if(inp[a]%inp[b]==0){
              tmp=false;
            }
          }
        }
      }
      if(tmp){
        ans++;
      }
      tmp=true;
    }
    System.out.println(ans);
  }
}
