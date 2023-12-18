import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x[] = new int[n+1];
    int y[] = new int[m+1];
    int maxx = -1000000;
    int miny = 1000000;
    x[0]=sc.nextInt();
    y[0]=sc.nextInt();
    for(int i=1;i<n+1;i++){
      x[i]=sc.nextInt();
    }
    for(int i=1;i<m+1;i++){
      y[i]=sc.nextInt();
    }
    for(int i=0;i<n+1;i++){
      maxx=Math.max(maxx,x[i]);
    }
    for(int i=0;i<m+1;i++){
      miny=Math.min(miny,y[i]);
    }
    if(maxx<miny){
      System.out.println("No War");
    }else{
      System.out.println("War");
    }
    
    
      
  }
  

  
}