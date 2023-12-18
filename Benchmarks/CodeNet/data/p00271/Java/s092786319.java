import java.util.Scanner;
public class Main{
    int high;
    int low;
    int sa;
    int n;
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
        n=0;
        while(n<7){
            high=sc.nextInt();
            low=sc.nextInt();
            sa=high-low;
            System.out.println(sa);
            n+=1;
        }
    }
    
    public static void main(String[] args){
        Main obj=new Main();
        obj.solve();
    }
}