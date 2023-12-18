import java.util.Scanner;
public class Main{
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        while(cnt<7){
           int a=sc.nextInt();
           int b=sc.nextInt();
            System.out.println(a-b);
            cnt++;
        }
            }
     
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}