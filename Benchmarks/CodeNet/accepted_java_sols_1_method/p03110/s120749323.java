import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[]x = new double[N];
    String[]u = new String[N];

    double ans = 0.0;
    for(int i=0; i<N; i++){
    x[i] = sc.nextDouble();
    u[i] = sc.next();

    if(u[i].equals ("BTC")){
        x[i]*=380000.0;
}
    ans += x[i];
}    
	System.out.println(ans);
      }
}
