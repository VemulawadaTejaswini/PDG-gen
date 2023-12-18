    import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();  //時針長さ
    int b = sc.nextInt();  //分針長さ
    int h = sc.nextInt()*60;  //時
    int w = sc.nextInt();  //分
    
    double radA = 2*Math.PI/(12*60);  //時針角速度(rad/min)
    double radB = 2*Math.PI/60;  //分針角速度(rad/min)
    double x = Math.abs(w*radB-(h+w)*radA);
    
    double ans2 = Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(x);
    double ans = Math.sqrt(ans2);
    System.out.println(ans);
  }
}