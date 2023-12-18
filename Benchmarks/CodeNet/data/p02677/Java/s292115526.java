import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int H = sc.nextInt();
    int M = sc.nextInt();

    //時間合計
    int th = 60*H + M;
    //時間の角度
    double hr =  th*0.5;
    //分の角度
    double mr = (th%60)*6;
    //角度（小さいほう）

    double r = Math.abs(hr-mr);

    if (r > 180){
      r = 360 - r;
    }
	
    double ans;
    ans = Math.sqrt(A*A+B*B-2*A*B*Math.cos(Math.toRadians(r)));

    System.out.println(ans);


  }
}
