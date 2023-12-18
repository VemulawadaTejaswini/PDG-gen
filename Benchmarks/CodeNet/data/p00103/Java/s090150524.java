import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr=new PrintWriter(System.out);
	public static void main(String[] args) {
		
		Main app=new Main();
		app.doing();
		
	}
	void doing(){
		int n= sc.nextInt();
		for (int i=0;i<n;i++) {
			final boolean[] judge= new boolean[3];
			int of = 0;
			int point = 0;
			while (of<3) {
				String str=sc.next();
				if ( "HIT".equals(str) ){
					if ( judge[2] ){
						judge[2]=false;
						point++;
					}
					judge[2]=judge[1];judge[1]=judge[0];judge[0]=true;
				} else if( "HOMERUN".equals(str)){
					point++;
					if ( judge[0] ) point++;if ( judge[1] ) point++;if ( judge[2] ) point++;
					Arrays.fill(judge, false);
				} else if( "OUT".equals(str))of++;
				
			}
			pr.println(point);
		}   
		pr.flush();
		
	}
}