import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String input = br.readLine();
		int M = Integer.parseInt(input);
		int i = 0;
		int j = 0;
		String card = new String();
		int[] spade = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] heart = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] clab = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] dia = {1,2,3,4,5,6,7,8,9,10,11,12,13};


		for( i=0 ; i<M ; i++ ){
			card = br.readLine();
			String[] cardvo = card.split(" ");

			if( cardvo[0].equals("S")){
				for( j=0 ; j<13 ;j++ ){
					if( spade[j]==Integer.parseInt(cardvo[1]) ) spade[j]=100;
				}
			}else if( cardvo[0].equals("H")){
				for( j=0 ;j<13 ;j++ ){
					if( heart[j]==Integer.parseInt(cardvo[1]) ) heart[j]=100;
				}
			}else if( cardvo[0].equals("C")){
				for( j=0; j<13 ; j++ ){
					if( clab[j]==Integer.parseInt(cardvo[1]) ) clab[j]=100;
				}
			}else{
				for( j=0 ; j<13 ; j++ ){
					if( dia[j]==Integer.parseInt(cardvo[1]) ) dia[j]=100;
				}
			}
		}

		for( i=0 ; i<13 ; i++ ){
			if( spade[i]!=100 ) sb.append("S ").append(spade[i]).append("\n");
		}
		for( i=0 ; i<13 ; i++ ){
			if( heart[i]!=100 ) sb.append("H ").append(heart[i]).append("\n");
		}
		for( i=0 ; i<13 ; i++ ){
			if( clab[i]!=100 ) sb.append("C ").append(clab[i]).append("\n");
		}
		for( i=0 ; i<13 ; i++ ){
			if( dia[i]!=100 ) sb.append("D ").append(dia[i]).append("\n");
		}

		System.out.print(sb);
	}
}