import java.util.*;

class Main{
  
  public  static int pop(int a){
    int cnt=0;
    for(int i=0;a>0;){
      if(a%2==1) cnt++;
      a/=2;
    }
    return cnt;
  }
  
  public static int genXn(int start,int n,int[] a){
    int num=(a[n]==1?(int)Math.pow(2,a.length-n-1):-(int)Math.pow(2,a.length-n-1));
    return num+start;
  }

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    String digit=s.next();
    int[] num=new int[N];
    int start=0;
    for(int i=0;i<N;i++){
      int c=(int)digit.charAt(i)-48;

      num[i]=(c==0?1:-1);
      start+=(c==1?Math.pow(2,i-1):0);
    }
    
    for(int i=0;i<N;i++){
      int x=genXn(start,i,num);
      int j=0;
      for(;;j++){
        if(pop(x)==0)break;
        if(pop(x)==1){
          j++;
          break;
        }
        x/=pop(x);
      }
      System.out.println(j);
    }
    
  }  
}