import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(N != 0){
			Point point = new Point(0,0);
			for(int i=0;i<N;i++){
				String[] lines = br.readLine().split(" ");
				int a = Integer.parseInt(lines[0]);
				int b = Integer.parseInt(lines[1]);
				if(a>b){
					point.a += a+b;
				}else if(b>a){
					point.b += a+b;
				}else{
					point.a += a;
					point.b += b;
				}
			}
			System.out.println(point.a + " " + point.b);
			N = Integer.parseInt(br.readLine());
		}
	}
	static class Point{
		public int a;
		public int b;
		Point(int a,int b){
			this.a = a;
			this.b = b;
		}
	}
}