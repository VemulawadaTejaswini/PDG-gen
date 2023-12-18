import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0,count=0;

		while((str=br.readLine()) != null){

			n = Integer.parseInt(str);

			for(int a=0; a<10;a++){
				for(int b=0; b<10; b++){
					for(int c=0; c<10; c++){
						for(int d=0; d<10; d++){
							if((a+b+c+d) == n){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}