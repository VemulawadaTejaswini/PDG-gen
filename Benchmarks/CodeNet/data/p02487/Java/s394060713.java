import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		String str;
		int height,width;

		while(true){
			str = br.readLine();

			if(str.equals("0 0")){
				break;
			}

			list.add(str);

		}

		for(int i=0;i<list.size();i++){
			height = Integer.parseInt(list.get(i).substring(0, str.indexOf(" ")));
			width = Integer.parseInt(list.get(i).substring(str.indexOf(" ")+1, str.length()));

			System.out.println();

			if(height>=3 && width<=100){
				for(int j=0;j<height;j++){
					for(int k=0;k<width;k++){
						if(j==0 || j==height-1 || k==0 || k==width-1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
					System.out.println();
				}
			}

			System.out.println();

		}
	}
}