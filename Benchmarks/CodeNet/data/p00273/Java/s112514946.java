import java.util.Scanner;
  
public class Main{
    public void solve(){
        Scanner sc=new Scanner(System.in);
          
        int n=sc.nextInt();
          
        for(int i=0;i<n;i++){
            int NR=sc.nextInt();
            int PR=sc.nextInt();
            int NM=sc.nextInt();
            int PM=sc.nextInt();
              
            int kei=NR*NM+PR*PM;
              
            if(NM>=5 && PM>=2){
                kei = (NR*NM + PR*PM)*4/5;
            }else{
                if(NM<5){
                NM=5;
                }
                if(PM<2){
                PM=2;
                }
                int wari = (NR*NM + PR*PM)*4/5;
                  
                if(kei>wari){
                    kei = wari;
                }
            }
            System.out.println(kei);
        }
    }
      
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}