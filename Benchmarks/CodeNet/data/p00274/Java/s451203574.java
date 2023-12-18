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
                if(n<p && p<=2){
                    n = n+1;
                    System.out.println(n);
                }else{
                    System.out.println("NA");
                }
                n =  sc.nextInt();
            }
        }
    public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
    }
    }