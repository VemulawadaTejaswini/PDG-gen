import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main( String... args ) throws Exception {

        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        String input = in.readLine();

        List<String> inputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        while ( input != null ) {
            inputList.add( input );
            input = in.readLine();
        }

        int number = Integer.parseInt( inputList.get( 0 ) );
        String array[] = inputList.get( 1 ).split( " " );

        for ( int i = number; i > 0; i = i - 2 ) {
            outputList.add( array[i - 1] );
        }

        for ( int i = (number % 2); i < number; i = i + 2 ) {
            outputList.add( array[i] );
        }

        System.out.println( String.join( " ", outputList ) );

    }
}
