import java.util.Scanner;
class Main{
    int a,b,c;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b){
            if (b < c){
                System.out.println(a + " " + b + " " + c);
            }else if(a < c){
                    System.out.println(a + " " + c + " " + b);
            }else{
                System.out.println(c + " " + a + " " + b);
            }
        }else if(b < a){
            if(a < c){
                System.out.println(b + " " + a + " " + c);
            }else if(b < c){
                System.out.println(b + " " + c + " " + a);
            }else{
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
    public static void main(String[] args){
        new Main().solve();     
    }
 
}