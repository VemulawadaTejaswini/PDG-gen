import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int bnum[]=new int[num-1];
    int anum[]=new int [num];
    int Ans=0;
    for(int a=0; a<num-1; a++){
      bnum[a]=scan.nextInt();
    }
    anum[0]=bnum[0];
    for(int a=0; a<num-1; a++){
      if(anum[a]>bnum[a]){
        anum[a]=bnum[a];
      }
      anum[a+1]=bnum[a];
    }
    for(int a=0; a<num; a++){
      Ans+=anum[a];
    }
    System.out.println(Ans);
  }
}