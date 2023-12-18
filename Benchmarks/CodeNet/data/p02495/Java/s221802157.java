import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> list = new ArrayList<String>();

		String str;
		int h,w;

		while(true){
			str = br.readLine();

			if(str.equals("0 0")){
				break;
			}
			list.add(str);

		}

		for(int i=0; i<list.size(); i++){
			h=Integer.parseInt((String) list.get(i).substring(0, list.get(i).indexOf(" ")));
			w=Integer.parseInt((String) list.get(i).substring(list.get(i).indexOf(" ")+1, list.get(i).length()));

			for(int j=0; j<h; j++){
				for(int k=0; k<w; k++){
					if((j+k)%2 == 0){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}