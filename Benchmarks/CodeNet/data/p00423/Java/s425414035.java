import java.util.Scanner;
import java.util.Vector;

class Main{
  public static class ScoreSet{
    public int a,b;
    ScoreSet( int aa, int bb ){
      a = aa; b = bb;
    }
  }
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    Vector<Integer> vecA = new Vector<Integer>();
    Vector<Integer> vecB = new Vector<Integer>();
    Vector<ScoreSet> ss = new Vector<ScoreSet>();
    while(sc.hasNextInt()){
      int n = sc.nextInt();
      if ( n == 0 ) break;
      for ( int i = 0; i < n; ++i ){
        vecA.add( sc.nextInt() );
        vecB.add( sc.nextInt() );
      }
      int sa = 0;
      int sb = 0;
      for ( int i = 0; i < vecA.size(); i++ ){
        if ( vecA.get(i) == vecB.get(i) ){
          sa += vecA.get(i);
          sb += vecB.get(i);
        }else if ( vecA.get(i) < vecB.get(i) ){
          sb += vecA.get(i) + vecB.get(i);
        }else{
          sa += vecA.get(i) + vecB.get(i);
        }
      }
      ss.add( new ScoreSet( sa,sb ) );
    }
    for ( ScoreSet s : ss ){
      System.out.println( s.a + " " + s.b );
    }

  }
}