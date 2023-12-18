import java.util.Scanner;

class Main{
    int a,b;
        
    public void solve(){
     int x = 0;
     Scanner sc = new Scanner(System.in);
     while(x < 7){

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a - b);
        x++;
    }
    }
    
    public static void main(String[] args){
        
        new Main().solve();
                
    }

}