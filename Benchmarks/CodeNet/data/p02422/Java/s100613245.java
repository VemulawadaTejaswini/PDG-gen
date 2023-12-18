import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		String str = br.readLine();
		int q = Integer.parseInt(br.readLine());
		int z = 0;

		while( z<q ){
			String[] input = br.readLine().split(" ");

			if( input[0].equals("replace")){
				if( input[1].equals("0") && input[2].equals(Integer.toString(str.length()-1))){
					str = input[3];
				}else if( input[1].equals("0") ){
					sb.append(input[3]).append(str.substring(Integer.parseInt(input[2])+1, str.length()));
					str = sb.toString();
				}else if( input[2].equals(Integer.toString(str.length()-1)) ){
					sb.append(str.substring(0, Integer.parseInt(input[1]))).append(input[3]);
					str = sb.toString();
				}else{
					sb.append(str.substring(0, Integer.parseInt(input[1]))).append(input[3]).append(str.substring(Integer.parseInt(input[2])+1, str.length()));
					str = sb.toString();
				}
			}else if( input[0].equals("reverse") ){
				sb.append(str.substring(Integer.parseInt(input[1]), Integer.parseInt(input[2])+1));
				String rts = sb.reverse().toString();
				sb.setLength(0);

				if( input[1].equals("0") && input[2].equals(Integer.toString(str.length()-1))){
					str = rts;
				}else if( input[1].equals("0") ){
					sb.append(rts).append(str.substring(Integer.parseInt(input[2])+1, str.length()));
					str = sb.toString();
				}else if( input[2].equals(Integer.toString(str.length()-1)) ){
					sb.append(str.substring(0, Integer.parseInt(input[1]))).append(rts);
					str = sb.toString();
				}else{
					sb.append(str.substring(0, Integer.parseInt(input[1]))).append(rts).append(str.substring(Integer.parseInt(input[2])+1, str.length()));
					str = sb.toString();
				}
			}else if( input[0].equals("print") ){
				sb2.append(str.substring(Integer.parseInt(input[1]), Integer.parseInt(input[2])+1) ).append("\n");
			}
			sb.setLength(0);
			z++;
		}

		System.out.print(sb2);
	}
}