import java.util.Scanner;
class Main{
    int N;
    int x;
    int y;
    int b;
    int p;
    int cnt=0;
    int i;
    int k;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        while(cnt<N){
            x = sc.nextInt();
            y = sc.nextInt();
            b = sc.nextInt();
            p = sc.nextInt();
            if(b<=5&&p<=2){
            
            double a,c;
                a=(x*0.8)*b;
                c=(y*0.8)*p;
            
                
                System.out.println(a+c);
                cnt++;
                
            }else{        
            
            i=x*b;
            k=y*p;
            
            System.out.println(i+k);
            cnt++;
        }
        }
    }
        public static void main(String[]args){
            Main obj = new Main();
            obj.solve();
        }
    }