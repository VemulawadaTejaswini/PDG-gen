import java.util.Scanner;
class Main{
    int maisu;
    int seki;
    int cnt=0;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        
        while(cnt<4){
            seki = sc.nextInt();
            maisu = sc.nextInt();
            switch(seki){
                case 1:
                seki = 6000;
                break;
                case 2:
                seki = 4000;
                break;
                case 3:
                seki = 3000;
                break;
                case 4:
                seki = 2000;
                break;
            }
            cnt++;
            System.out.println(seki*maisu);
        }
        }
        public static void main(String[]args){
            Main obj = new Main();
            obj.solve();
        }
    }
    