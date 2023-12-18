import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int hi,x,y,b,p;
        
        hi=sc.nextInt(); 
      if(hi>=1&&hi<=365){
          for(int i=1;i<=hi;i--){
          x=sc.nextInt();
          y=sc.nextInt();
          b=sc.nextInt();
          p=sc.nextInt();
              
              int kei=x*b+y*p;
              
        if(b>=5&&p>=2){
            kei=(x*b+y*p)/10*8;
        }else{
            if(b<5){
                b=5;
            }
            if(p<2){
                p=2;
            }
            int wari=(x*b+y+p)/10*8;
            
            if(kei>wari){
                kei=wari;
            }
        }
            System.out.println(kei);
          }
      }
    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}