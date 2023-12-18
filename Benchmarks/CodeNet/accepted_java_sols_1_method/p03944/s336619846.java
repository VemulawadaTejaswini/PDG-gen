import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt();
      	int h = scn.nextInt();
      	int n = scn.nextInt();
		int[] x = new int[n];
      	int[] y = new int[n];
      	int[] a = new int[n];
		for(int i=0; i<n; i++){
			x[i] = scn.nextInt();
          	y[i] = scn.nextInt();
          	a[i] = scn.nextInt();
		}
      	//白の面積を求める
      	int x0 = 0;//xの下限値
      	int y0 = 0;//yの下限値
      	int x1 = w;//xの上限値
      	int y1 = h;//yの上限値
      	for(int i=0; i<n; i++){
          if(a[i]==1 && x0 < x[i]) x0 = x[i];//a=1でかつx0<x[i]なら下限値更新
          if(a[i]==2 && x1 > x[i]) x1 = x[i];//a=2でかつx1>x[i]なら上限値更新
          if(a[i]==3 && y0 < y[i]) y0 = y[i];//a=3でかつx0<x[i]なら下限値更新
          if(a[i]==4 && y1 > y[i]) y1 = y[i];//a=4でかつx0>x[i]なら上限値更新
        }
      	int ans = (x1-x0)*(y1-y0);
      	if(x0>=x1 || y0>=y1) ans = 0;//下限値が上限値を上回っていた場合は面積０
      	System.out.println(ans);
	}
}
