import java.util.Scanner;
public class Main{
    int k,kai;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        
        int N=sc.nextInt(); 
      
        while(N!=0){ 
            for(int i=0;i<N;i++){
                k=sc.nextInt();
            }
            if(N==1){
                kai=2;
                System.out.println(kai);
             }else if(k>=2){
                kai=N+1;
                System.out.println(kai);
             }else if(k==0||k==1){      
                System.out.println("NA");
            }
            N=sc.nextInt();
        }
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}