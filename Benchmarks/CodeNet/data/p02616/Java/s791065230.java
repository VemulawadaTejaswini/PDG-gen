import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt(),K=sc.nextInt(),p=1000000007;
    ArrayList<Long> pl=new ArrayList<Long>();
    ArrayList<Long> mi=new ArrayList<Long>();
    for(int i=0;i<N;i++){
      long t=sc.nextLong();
      if(t>=0){
        pl.add(t);
      }
      else{
        t=Math.abs(t);
        mi.add(t);
      }
    }
    sc.close();
    Collections.sort(pl);
    Collections.sort(mi);
    boolean pos=true;
    long ans=1;
    long lastpl=0,lastmi=0;
    if((pl.size()>0)&&(mi.size()>0)){
    for(int i=0;i<K;i++){
      lastpl=pl.get(pl.size()-1);
      lastmi=mi.get(mi.size()-1);
      if(lastpl>=lastmi){
        ans*=lastpl;
        ans%=p;
        pl.remove(pl.size()-1);
      }
      else{
        ans*=lastmi;
        ans%=p;
        mi.remove(mi.size()-1);
        if(pos) pos=false;
        else pos=true;
      }
    }}
    else if((mi.size()==0)&&(pl.size()>0)){
      for(int i=0;i<K;i++){
        ans*=pl.get(pl.size()-i-1);
        ans%=p;
      }
    }
    else if((pl.size()==0)&&(mi.size()>0)){
      if(K%2==0){
      for(int i=0;i<K;i++){
        ans*=mi.get(mi.size()-i-1);
        ans%=p;
      }}
      else{
        for(int i=0;i<K;i++){
          ans*=mi.get(i);
          ans%=p;
        }
        ans=p-ans;
      }
    }
    if(pos){
      System.out.println(ans);
    }
    else{
      long removemi=(ans*pl.get(pl.size()-1)/lastmi)%p;
      long removepl=(ans*mi.get(mi.size()-1)/lastpl)%p;
      System.out.println(removemi>removepl?removemi:removepl);
    }
  }
}