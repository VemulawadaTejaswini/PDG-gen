import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			String[] size = input.split(" ");
			Integer height = Integer.parseInt(size[0]);
			Integer width = Integer.parseInt(size[1]);
			if(height == 0 && width == 0){
				break;
			}
			for(int i=1; i <= height; i++){
				String rect = "";
				for(int j=1; j <= width; j++){
					rect += "#";
				}
				rect += "\n";
				System.out.print(rect);
			}
			System.out.println("");
		}

	}

}