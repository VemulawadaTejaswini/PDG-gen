
import java.util.*;

public class Main{
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
        int n=sc.nextInt();
        pair p[]=new pair[n];
        for(int i=0;i<n;i++) {
          int x=sc.nextInt();
          int y=sc.nextInt();
          pair pp=new pair(x,y);
          p[i]=pp;
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++) {
          int count=1;
          for(int j=0;j<n;j++) {
            if((p[j].x>p[i].x&&p[j].y>p[i].y)||(p[j].x<p[i].x&&p[j].y<p[i].y)) {
              count++;
              if(j<i&&(p[j].x>p[i].x&&p[j].y>p[i].y)) {
                count=ans[j];
                break;
              }
            }
            
            
          }
          ans[i]=count;
        }
         for(int i:ans) {
           System.out.println(i);
         }
         
    
    }catch(Exception e) {return ;
    }
    }
    

    

}
class pair{
  int x,y;
  pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}
