import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	 public static void main(String[] age)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringBuffer sb = new StringBuffer();

		 int n = Integer.parseInt(br.readLine());
		 int i = 0;
		 int j = 0;
		 int a = 0;
		 int T = 0;
		 int H = 0;
		 String alha = "abcdefghijklmnopqrstuvwxyz";

		 while( a<n ){
			 String[] input = br.readLine().split(" ");

			 if( input[0].equals(input[1]) ){
				 T++;
				 H++;
			 }else if( input[0].length()>=input[1].length() ){
				 for( i=0 ; i<input[1].length() ; i++ ){
					 if( input[0].substring(i, i+1).equals(input[1].substring(i, i+1))){
						 if( i==input[1].length()-1 ) T = T+3;
					 }else{
						 for( j=0 ; j<26 ; j++ ){
							 if( input[0].substring(i,i+1).equals(alha.substring(j, j+1)) ){
								 H = H+3;
								 break;
							 }else if( input[1].substring(i,i+1).equals(alha.substring(j,j+1))){
								 T = T+3;
								 break;
							 }
						 }
						 break;
					 }
				 }
			 }else if( input[0].length()<input[1].length() ){
				 for( i=0 ; i<input[0].length() ; i++ ){
					 if( input[0].substring(i, i+1).equals(input[1].substring(i, i+1))){
						 if( i==input[0].length()-1 ) H = H+3;
					 }else{
						 for( j=0 ; j<26 ; j++ ){
							 if( input[0].substring(i,i+1).equals(alha.substring(j, j+1)) ){
								 H = H+3;
								 break;
							 }else if( input[1].substring(i,i+1).equals(alha.substring(j,j+1))){
								 T = T+3;
								 break;
							 }
						 }
						 break;
					 }
				 }
			 }

			 a++;
		 }

		 sb.append(Integer.toString(T)).append(" ").append(Integer.toString(H));
		 System.out.println(sb);
	 }
}