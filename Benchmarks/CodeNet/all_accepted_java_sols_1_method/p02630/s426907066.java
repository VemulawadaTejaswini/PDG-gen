import java.util.Scanner;
class Main{
    public static void main(String []args){
    Scanner input=new Scanner(System.in);
      long result=0;
      int N=input.nextInt();
      int sum[]=new int[100001];
    for(int i=0;i<N;++i){
      int temp=input.nextInt();
      ++sum[temp];
      result+=temp;
    }int operation=input.nextInt();
      for(int j=0;j<operation;j++){
        int B=input.nextInt();
        int C=input.nextInt();
        if(sum[B]!=0){
          int temp=sum[B];
          sum[B]=0;
          sum[C]+=temp;
          result+=((C-B)*temp);
        }
        System.out.println(result);
      }
    }
}