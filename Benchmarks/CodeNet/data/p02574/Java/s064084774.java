import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    Integer[] data=new Integer[N];
	boolean pair=true;
    Set<Integer> setwise=new HashSet<>();
    for(int i=0;i<N;i++){
      for(int j=i;j<N;j++){
        int res=gcd(data[i],data[j]);
        if(res!=1){
          pair=false;
        }
		setwise.add(res);
      }
    }
    if(pair=true){
      System.out.println("pairwise coprime");
    }else{
      int result=setGcd(setwise);
      if(result==-1){
        System.out.println("setwise coprime");
      }else{
        System.out.println("not coprime");
      }
    }
  
  }
  
  static int setGcd(HashSet<Integer> s){
    HashSet<Integer> setwise=new HashSet<>();
	for(int i=0;i<s.size();i++){
     for(int j=i;j<s.size();j++){
       setwize.add(gcd(s.get(i),s.get(j)));
     }
    }
    if(setwise.size()==1){
      if(setwize.contain(1)){
        return -1;
      }else{
        return -2;
      }
    }else{
      return setGcd(setwise);
    }
  }
  
  static int gcd(int a,int b){
    if(a%b==0) return b;
	else return gcd(b,a%b);    
  }
  
}