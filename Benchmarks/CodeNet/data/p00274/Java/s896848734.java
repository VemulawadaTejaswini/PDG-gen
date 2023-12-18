import java.util.Scanner;
public class Main{
    int a;//在庫  
    int b=1;//添え字（回数）
    int c;//添え字
    int n;//種類
  
    public void solve(){
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
       
        while(n!=0){
         for(int i=0;i<n;i++){
             a = sc.nextInt();
             if(a>=2){
                 b+=1; 
             } else if(a==1){
                 c+=1;
             }
         }    
        if(b>=n){
          System.out.println(b+c);
        }else{
             System.out.println("NA"); 
        }  
        b=1;
        c=0;
       n = sc.nextInt();
      }         
  }
    
    public static void main(String[] args){
      Main obj=new Main();
        obj.solve();
    }
}