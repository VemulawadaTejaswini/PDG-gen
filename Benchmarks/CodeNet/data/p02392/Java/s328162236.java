/*
2725 ??´??¨?????? 1_2 A
*/
import java.util.Scanner;

    public class Main{
        public void solve(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<b){
			if(b<c){
				System.out.print("Yes");
			}else{
				System.out.print("No");
			}
		}
        }
    public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
    }
    }