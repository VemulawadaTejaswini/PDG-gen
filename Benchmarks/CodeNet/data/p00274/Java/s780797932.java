import java.util.Scanner;
public class Main{
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int kaisu = 1;
        int syu = sc.nextInt();
        
        while(syu != 0){
            for(int k=1; k<=syu; k++){
            int j = sc.nextInt();
                
                if(j >= 2){
                    kaisu++;
                }else if(j == 1){
                    m++;
                }
            }
            if(kaisu >= 2){
                System.out.println(kaisu+m);
            }else{
                System.out.println("NA");
            }
            
            m = 0;
            kaisu = 1;
            syu = sc.nextInt();
        }
    }
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}
            
                
         