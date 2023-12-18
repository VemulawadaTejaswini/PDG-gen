import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		//		//		while(in.hasNext())
		new AOJ0076();	
	}


	class AOJ0076{
		public AOJ0076() {

			while(true){
				int n = in.nextInt();
				if(n==-1)break;
				Walker w = new Walker();
				for(int i=0;i<n-1;i++)w.doIt();
				System.out.printf("%.2f\n%.2f\n",w.x,w.y);
			}
		}

		class Walker{
			double x,y;
			double angle;
			public Walker() {
				x=1.0;
				y=0.0;
			}

			void doIt(){
				double l1 = Math.sqrt(x*x+y*y);//ベクトルの長さ
				double sx = -y/l1; //法線ベクトルx/長さ
				double sy = x/l1;  //法線ベクトルy/長さ
				x+=sx;y+=sy;
			}
		}
	}

}