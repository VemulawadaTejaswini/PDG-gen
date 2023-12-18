import java.util.Scanner;
    public class Main{
        public void solve(){
        Scanner sc = new Scanner(System.in);
            int n,k,p;
            n = sc.nextInt();
            p = 0;
            while(n!=0){
                for(int i=0;i<=n;i++){
                    k = sc.nextInt();
                    if(p<k){
                        p = k;
                    }
                }
                if(p>2){
                    System.out.println(n);
                }else{
                    System.out.println("NA");
                }
                n =  sc.nextInt();
                p =0;
            }
        }
        
    public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
    }
    }