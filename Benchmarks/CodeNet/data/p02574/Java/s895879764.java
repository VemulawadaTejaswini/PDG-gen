import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    Integer[] data=new Integer[N];
	boolean pair=true;
    HashSet<Integer> setwise=new HashSet<>();
    for(int i=0;i<N;i++){
      for(int j=i;j<N;j++){
        int res=gcd(data[i],data[j]);
        if(res!=1){
          pair=false;
        }
		setwise.add(res);
      }
    }
    Main kari=new Main();
    if(pair=true){
      System.out.println("pairwise coprime");
    }else{
      int result=kari.setGcd(setwise);
      if(result==-1){
        System.out.println("setwise coprime");
      }else{
        System.out.println("not coprime");
      }
    }
  
  }
  
  int setGcd(HashSet<Integer> s){
    HashSet<Integer> setwise2=new HashSet<>();
    Iterator<Integer> it = setwise2.iterator<>();
	List<Integer> setList=new ArrayList<>();
    while (it.hasNext()) {
      setList.add(it.next());
    }
	for(int i=0;i<setList.size();i++){
     for(int j=i;j<setList.size();j++){
       setwise2.add(gcd(setList.get(i),setList.get(j)));
     }
    }
    if(setwise2.size()==1){
      if(setwise2.contain(1)){
        return -1;
      }else{
        return -2;
      }
    }else{
      return setGcd(setwise2);
    }
  }
  
  static int gcd(int a,int b){
    if(a%b==0) return b;
	else return gcd(b,a%b);    
  }
  
}
