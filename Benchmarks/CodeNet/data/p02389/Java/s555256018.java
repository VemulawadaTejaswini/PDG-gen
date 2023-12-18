import java.util.Scanner;

class Main{
    int a,b;
        
    public void solve(){
        int x,y;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        x = a * b;
        y = 2 * (a + b);
        System.out.println(x + " " + y);
        
    }
    
    public static void main(String[] args){
        
        new Main().solve();
                
    }

}