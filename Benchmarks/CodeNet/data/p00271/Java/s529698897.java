import java.util.Scanner;
    public class Main{
        Scanner sc=new Scanner(System.in);
        int a,b;
        int sa=a-b;
    public void solve(){
        for(int i=0;i<=7;i++){
            a= sc.nextInt();
            b = sc.nextInt();
            System.out.println(sa);
        }
    }
    public static void main(String[] args){
            Main obj= new Main();
            obj.solve();
    }
    }