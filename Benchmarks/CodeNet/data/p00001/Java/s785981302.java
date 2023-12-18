package mountain;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class moutain {

	public static void main(String[] args)throws IOException {
		// TODO ?????????????????????????????????????????????

		ArrayList<Integer> array = new ArrayList<Integer>();


	   int [] a = new int [10];

	   for(int n = 0; n < 10; n++){

		 BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
			   int j =  Integer.parseInt(reader.readLine());


		   a[n] =  j;
		   array.add( a[n] );
	   }



		Collections.sort(array);
		Collections.reverse(array);

	     for(int i =0; i <  3; i++){
			System.out.println(array.get(i));

		}
	}

}