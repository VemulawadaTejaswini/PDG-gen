import java.util.Scanner;
  
class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner( System.in);   
          
        while( true ) {
            int H = kb.nextInt();
            int W = kb.nextInt();
              
            if( 0==W && 0==H ) { break; }
           
           StringBuilder output = new StringBuilder( 300+1 );	
            boolean cPattern=true;
            for( int i=0; i<H; i++ ) {
                cPattern= (0==(i&1))? true: false;
                for( int j=0; j<W; j++ ) {
                    if( cPattern ) {
                    	output.append( "#"  );
                        cPattern=!cPattern;
                    } else {
                        output.append( "."  );
                        cPattern=!cPattern;
                    }
                }
                output.append( "\n"  );
            }
            System.out.println( output );
        }
    }
}