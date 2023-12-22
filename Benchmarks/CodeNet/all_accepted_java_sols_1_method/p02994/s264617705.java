import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int L=scan.nextInt();
    int[] apple=new int[N];
    int correct=0;
    for(int i=0;i<N;i++){
      apple[i]=L+i;
      correct+=apple[i];
    }
    int[] taste=new int[N];
    int min=0;
    int ans=0;
    int tmp=0;
    int tmp_correct=0;
    int tmp_taste=0;
    boolean flag=true;
    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        if(i==j){
          continue;
        }
        taste[i]+=apple[j];
      }
      tmp_correct=correct;
      tmp_taste=taste[i];
      if(correct<0){
        tmp_correct=-tmp_correct;
      }
      if(tmp_taste<0){
        tmp_taste=-tmp_taste;
      }
      tmp=tmp_correct-tmp_taste;
      if(tmp<0)tmp=-tmp;
      if(flag){
        min=tmp;
        ans=taste[i];
        flag=false;
      }
      if(min>tmp){
        min=tmp;
        ans=taste[i];
      }
      // System.out.println("correct:"+correct);
      // System.out.println("taste["+i+"]"+taste[i]);
      // System.out.println("eat"+tmp);
    }
    System.out.println(ans);
  }
}