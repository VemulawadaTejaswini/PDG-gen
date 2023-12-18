public class Main {

  /*
   * <Expr> ::= <Term> | <Expr> + <Term> 
   * <Term> ::= <Fact> | <Term> * <Fact> 
   * <Fact> ::= 0-9
   */

  String line;
  char sy;
  int pos = 1;

  char getToken() {
    if( this.pos == line.length() ) { 
      this.pos++;
      return '\0';
    }
    return this.sy = line.charAt( this.pos++ );
  }

  int expression() {
//    System.out.println( "EXP" + " SY" + this.sy + " POS" + this.pos );
    int n = this.term();
    if( this.sy == '+' ) {
      this.getToken();
//      System.out.println( "DBG" + this.sy + " " + this.pos );
      int m = this.expression();
//      System.out.println( ">EXP1" + " SY"+ this.sy + " POS" + this.pos + " " + n + " " + m );
      return n + m;
    }

//    System.out.println( ">EXP2" + " SY"+ this.sy + " POS" + this.pos );
    return n;
  }

  int term() {
//    System.out.println( "TRM" + " SY"+ this.sy + " POS" + this.pos );
    int n = this.factor();
    if( this.sy == '*' ) {
      this.getToken();
      int m = this.term();
//      System.out.println( ">TRM1" + " SY"+ this.sy + " POS" + this.pos );
      return n * m;
    }

//    System.out.println( ">TRM2" + " SY"+ this.sy + " POS" + this.pos );
    return n;
  }

  int factor() {
//    System.out.println( "FCT" + " SY"+ this.sy + " POS" + this.pos );
    if( this.sy < '0' || '9' < this.sy ) {
      System.err.println( "ERROR" );
      System.exit( -1 ); // Error
    }

    int n =  this.sy - '0';
    this.getToken();

//    System.out.println( ">FCT" + " SY"+ this.sy + " POS" + this.pos );
    return n;
  }

  int mfunc() {
    int len = this.line.length();
    int x = this.line.charAt( 0 ) - '0';
    for( int i = 1; i < len - 1; i += 2 ) {
      char c = this.line.charAt( i );
      int opr = this.line.charAt( i + 1 ) - '0';
      if( c == '+' ) {
        x += opr;
      } else if( c == '*' ) {
        x *= opr;
      } 
    }
    return x;
  }

  void run(
      java.io.InputStream in,
      java.io.PrintStream out
      ) {

      java.util.Scanner sc = new java.util.Scanner( in );
      this.line = sc.next();
      int n = Integer.parseInt( sc.next() );
      this.sy = this.line.charAt(0);
      int ans1 = this.expression();
      int ans2 = this.mfunc();

      if( n == ans1 ) {
        if( n == ans2 ) {
          out.println( "U" );
        } else {
          out.println( "M" );
        }
      } else {
        if( n == ans2 ) {
          out.println( "L" );
        } else {
          out.println( "I" );
        }

      }
  }

  public static void main( String[] main ) {
    new Main().run( System.in, System.out );
  }
}