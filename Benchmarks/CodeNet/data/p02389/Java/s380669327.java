import java.util.Scanner;

    public class Main{
        public void solve(){
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int menseki = a*b;
		int syu = (a+b)*2;
		System.out.println(menseki+""+syu);
        }
    public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
    }
    }