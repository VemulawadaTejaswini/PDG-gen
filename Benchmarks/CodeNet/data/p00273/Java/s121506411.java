import java.util.Scanner;
    public class Main{
        public void solve();
        Scanner sc = new Scanner(System.in);
        int n,x,y,b,p,kin;
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        b = sc.nextInt();
        p = sc.nextInt();
        kin = (x*b)+(y*p);
        if(x=>5 && y=>2){
            System.out.println(kin*0.8);
        }else{
            System.out.println(kin);
        }
public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
}
    }