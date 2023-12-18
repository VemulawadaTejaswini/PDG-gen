import java.util.Scanner;
public class Main{
    public void solve(){
        Scanner sc=new Scanner(System.in);
        for(int r=0;r<4;r++){
            int num=sc.nextInt();
            int su=sc.nextInt();
            switch(num){
                case 1:
                System.out.println(su*6000);
                break;
                case 2:
                System.out.println(su*4000);
                break;
                case 3:
                System.out.println(su*3000);
                break;
                case 4:
                System.out.println(su*2000);
                break;
            }
        }
    }
    public static void main(String[]args){
        Main obj=new Main();
        obj.solve();
    }
}