import java.util.Scanner;
    
class Main{
 Scanner sc;
    int a,b;
    
    public void solve(){
        sc = new Scanner(System.in);   
        sub();
        sub();
        sub();
        sub();
        sub();
        sub();
        sub();
    }
    void sub(){ 
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a-b);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}