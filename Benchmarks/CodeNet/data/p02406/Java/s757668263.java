import java.io.*;

class Main {
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			
			for( int i = 1; i <= a; i++){
				String str1 = "3";
				String str2 = Integer.toString(i);	
				if( i % 3 == 0 || str2.contains(str1)){
				System.out.print(i+" ");
				}
			}
		System.out.print("\n");
		} catch (Exception e){
		}
	}
}