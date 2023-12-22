import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int number[] = new int[26];
		String AlHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alha = "abcdefghijklmnopqrstuvwxyz";
		int i = 0;
		int j = 0;
		String input;
		String a;

		while(( input = br.readLine())!=null ){
			for( i=0 ; i<input.length() ; i++ ){
				for( j=0 ; j<26 ; j++ ){
					a = input.substring(i, i+1);
					if( a.equals(AlHA.substring(j, j+1)) || a.equals(alha.substring(j, j+1))){
						number[j]++;
					}
				}
			}
		}

		for( i=0 ; i<26 ; i++ ){
			sb.append(alha.substring(i, i+1)).append(" : ").append(Integer.toString(number[i])).append("\n");
		}
		System.out.print(sb);
	}
}