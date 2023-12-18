import java.io.*;

public class M0022 {
	public static void main ( String args[] ) throws IOException {
		int i , j , sum , Input , max1 , max2;
		int[] data;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while ( true ) {
			sum = 0; max1 = 0; max2 = 0;
			data = new int[5000];
			Input = Integer.parseInt(in.readLine());
			if ( Input == 0 ) break;
			for ( i =0; i < Input; i++ )
				data[i] = Integer.parseInt(in.readLine());
			for ( i = 0; i < data.length; i++ ) {
				for ( j = i; j < data.length; j++ ) {
					sum += data[j];
					if ( max1 < sum ) max1 = sum;
				}
				if ( max2 < max1 ) max2 = max1;
				sum = 0;
			}
			System.out.println(max2);
		}
	}
}