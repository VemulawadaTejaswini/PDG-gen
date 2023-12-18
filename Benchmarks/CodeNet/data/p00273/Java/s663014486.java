import java.util.Scanner;
  
public class Main{
    public void solve(){
        Scanner sc=new Scanner(System.in);
          
        int n=sc.nextInt();
          
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int b=sc.nextInt();
            int p=sc.nextInt();
              
            int kin=x*b+y*p;
              
            if(b>=5 && p>=2){
                kin = (x*b + y*p)*4/5;
            }else{
                if(b<5){
                b=5;
                }
                if(p<2){
                p=2;
                }
                int wari = (x*b + y*p)*4/5;
                  
                if(kin>wari){
                    kin = wari;
                }
            }
            System.out.println(kin);
        }
    }
      
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}