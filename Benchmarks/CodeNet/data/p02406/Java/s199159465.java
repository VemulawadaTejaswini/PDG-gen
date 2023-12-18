import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

		int x=1;

		while(n>=x){
			int w=x;
			int y=0;
			int z=0;
			if(x%3==0){
				System.out.print(" "+x);
			}else{
				while(w==0){
					y=w%10;
					z=w/10;
					if(y==3){
						System.out.print(" "+x);
					}
					w=z;
				}
			}
			x++;
		}
		System.out.println("");
	}

}

