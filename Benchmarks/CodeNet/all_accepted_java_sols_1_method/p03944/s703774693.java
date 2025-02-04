import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int xu = W;
        int xl = 0;
        int yu = H;
        int yl = 0;
        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if(a==1){
                xl = Math.max(xl,x);
            }else if(a==2){
                xu = Math.min(xu,x);
            }else if(a==3){
                yl = Math.max(yl,y);
            }else if(a==4){
                yu = Math.min(yu,y);
            }
        }
        int xr = xu-xl;
        int yr = yu-yl;
        if(xr<0||yr<0){
            System.out.println(0);
        }else{
            System.out.println(xr*yr);
        }
    }
}