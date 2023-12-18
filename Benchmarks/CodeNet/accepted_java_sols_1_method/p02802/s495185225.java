import java.util.*;

public class Main{
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),m=sc.nextInt();
    int[] p = new int[m];
    String[] q = new String[m];
    
    for(int i = 0;i<m;i++){
      p[i] = sc.nextInt();
      q[i] = sc.next();
    }
    
    int[] ac = new int[100000];
    int[] wc = new int[100000];
    for(int i =0;i<100000;i++){
      ac[i]=0;
      wc[i]=0;
    }
    
    for(int i = 0;i<m;i++){
    	if(q[i].equals("AC")){
          ac[p[i]] = 1;
        }else if(ac[p[i]]!=1){
          wc[p[i]] += 1;
        }
    }
    int acsum = 0,wcsum = 0;
    for(int i =0;i<100000;i++){
      if(wc[i]!=0&&ac[i]==0){
        wc[i] = 0;
      }
    }
    
    for(int i =0;i<100000;i++){
      acsum += ac[i];
      wcsum += wc[i];
    }
    
    System.out.println(acsum +" "+wcsum);
    
  }
}
