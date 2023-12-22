import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int ac=0;
    int wa=0;
    int[] a=new int[n];
    for(int i=0;i<m;i++){
      int p=sc.nextInt()-1;
      String st=sc.next();
      if(a[p]==-1){
        
      }else if(st.equals("AC")){
        wa+=a[p];
        ac++;
        a[p]=-1;
      }else if(st.equals("WA")){
        a[p]++;
      }
    }
    System.out.println(ac+" "+wa);
  }
}