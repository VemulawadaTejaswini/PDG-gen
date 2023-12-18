import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ0096();
	}
	class AOJ0096{
		int doIt(){
			int result=0;
			int n=in.nextInt();
			/*(a,b)+(c,d)と考える。
			 * n=2で
			 * (a,b)=0なら1通り(0,0)      *       (c,d)=(1,1)(2,0)(0,2) =3
			 * 		=1なら2通り(1,0)(0,1)			     =(1,0)(0,1)      =4
			 * 		=2なら3通り(1,1)(2,0)(0,2)         =(0,0)          =3
			 * 

			 * (a,b)=0なら1通り(0,0)
			 *      =1なら2通り(1,0)(0,1)
			 *      =2なら3通り(1,1)(2,0)(0,2)
			 *      =3なら4通り(3,0)(0,3)(1,2)(2,1)
			 *      =4なら5通り(0,4)(4,0)(1,3)(3,1)(2,2)
			 *      
			 */
			for(int i=0;i<=n;i++){
				result+=((i+1))*(n-i+1);
			}
			return result;
		}


		public AOJ0096() {
			while(in.hasNext())System.out.println(doIt());
		}
	}

}