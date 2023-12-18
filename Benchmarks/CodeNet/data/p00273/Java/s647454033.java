import java.util.Scanner;
class Main{
    int N;
    int x,y,b,p;
    int cnt;
    int i,k;
    int go,wari;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        
        N=sc.nextInt();
        for(cnt=0; cnt<N; cnt++){
            x=sc.nextInt();
            y=sc.nextInt();
            b=sc.nextInt();
            p=sc.nextInt();
            
            go=x*b+y*p;
            
            if(b>=5 && p>=2){
                go=(x*b+y*p)*8/10;
                
            }else{
                if(b<5){
                    b=5;
                }
                if(p<2){
                    p=2;
                }
                wari=(x*b+y*p)*8/10;
                
                if(go>wari){
                    go=wari;
                }
            }
            System.out.println(go);
        }
    }
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}
                 