//10-A

//関数で考えるとわかりやすいかも
//三角関数　平方根の求め方　sqrt( x長さの2乗　＋　y長さの2乗 )
import java.util.Scanner;

class Main {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();//始点x
        double y1 = sc.nextDouble();//始点y
        double x2 = sc.nextDouble();//終点x
        double y2 = sc.nextDouble();//終点y
        
        //x方向の辺の長さは
        double xlength = x2 - x1;
        //y方向の辺の長さは
        double ylength = y2 - y1;
        
        //平方根 Math.sqrt(double a)
        double ans = Math.sqrt( xlength * xlength + ylength * ylength );
        System.out.println(ans);
        
        
        
    }
}