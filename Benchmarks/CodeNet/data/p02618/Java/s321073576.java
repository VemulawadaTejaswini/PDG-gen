import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int[] c=new int[26];
    int[] wc=new int[27];
    for(int i=0;i<26;i++){
      c[i]=sc.nextInt();
      wc[i+1]=wc[i]+c[i];
    }
    Random rd=new Random();
    for(int i=0;i<d;i++){
      int r=rd.nextInt(wc[26]);
      for(int i=0;i<26;i++){
        if(r<wc[i]){
          System.out.println(i+1);
          break;
        }
      }
    }
  }
}