import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int x=scn.nextInt();
    int x_=x;
    int ans=0;
    int n=scn.nextInt();
    ArrayList<Integer> p=new ArrayList<>();
    boolean flg=true;
    
    for(int i=0;i<n;i++){
		p.add(scn.nextInt());
    }
    
    while(flg){
      for(int i=0;i<p.size();i++){
        if(x_==p.get(i)){
          x_--;
          p.remove(i);
          i=-1;
        }
      }
        ans=x_;
        x_=x+1;
      
        for(int i=0;i<p.size();i++){
        	if(x_==p.get(i)){
        		x_++;
         		p.remove(i);
          		i=-1;
      		}
        }
        if(Math.abs(x_-x)<Math.abs(ans-x)) ans=x_;
        break;
    }
    System.out.println(ans);
  }
}
        
      