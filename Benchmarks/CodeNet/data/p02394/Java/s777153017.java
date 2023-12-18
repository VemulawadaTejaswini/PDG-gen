import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int width,height,x,y,r;
		String buf = br.readLine();
		String[] spl = buf.split(" ");
		width =Integer.parseInt(spl[0]);
		height =Integer.parseInt(spl[1]);
		x =Integer.parseInt(spl[2]);
		y =Integer.parseInt(spl[3]);
		r =Integer.parseInt(spl[4]);

		//???????????????
		if((x<r)){
			System.out.println("No");
			return;
		}else if(x>(width-r)){
			//???????????????
			System.out.println("No");
			return;
		}else if(y<r){
			System.out.println("No");
			return;
		}else if(y>(height-r)){
			System.out.println("No");
			return;
		}else{
			System.out.println("Yes");
		}




	}
}