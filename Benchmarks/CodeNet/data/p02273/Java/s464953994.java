import java.io.IOException;
import java.util.Scanner;

class Main {
	static final int INF = 1000000001;

	static int changecount;
   public static void main(String args[]) throws IOException{

      Scanner sc = new Scanner(System.in);

	   int n = Integer.parseInt( sc.next()  );

	   Cood p1 = new Cood(0 , 0);
 	   Cood p2 = new Cood(100 , 0);

 	   p1.printCood();
	   kock(n , p1, p2);
       p2.printCood();

	   sc.close();
   }


   public static void kock(int n, Cood p1, Cood p2){

      if( n == 0){
    	  return;
      }

      Cood s = new Cood( (2*p1.x + 1*p2.x)/3    ,   (2*p1.y + 1*p2.y)/3  );
      Cood t = new Cood( (1*p1.x + 2*p2.x)/3    ,   (1*p1.y + 2*p2.y)/3  );
      Cood u = new Cood( (t.x - s.x)*Math.cos(Math.toRadians(60)) - (t.y - s.y)*Math.sin( Math.toRadians(60) )+s.x  ,  (t.x - s.x)*Math.sin( Math.toRadians(60) ) + (t.y - s.y)*Math.cos( Math.toRadians(60) )+s.y  );

      kock(n-1, p1, s);
      s.printCood();
      kock(n-1, p1, u);
      u.printCood();
      kock(n-1, p1, t);
      t.printCood();
      kock(n-1, t, p2);
   }




}



class Cood{

	double x;
	double y;

    Cood(double X, double Y){
    	x = X;
    	y = Y;
    }

	void printCood(){
		System.out.print(String.format("%.8f ", x) );
		System.out.println(String.format("%.8f", y) );
		//System.out.println( x + " " +y);

	}

}