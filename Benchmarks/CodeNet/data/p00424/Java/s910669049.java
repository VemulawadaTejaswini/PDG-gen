import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			ConversionMap cmap = new ConversionMap();
			int num = Integer.parseInt(br.readLine());

			if(num == 0){
				break;
			}

			for(int i = 0; i < num; i++){
				String[] tmpStr = br.readLine().split(" ");
				cmap.setConversion(tmpStr[0].charAt(0), tmpStr[1].charAt(0));
			}

			int strLength = Integer.parseInt(br.readLine());

			for(int i = 0; i < strLength; i++){
				System.out.print(cmap.getConversion(br.readLine().charAt(0)));
			}
			System.out.println();
		}

	}

}

class ConversionMap {
	private char[] map;

	public ConversionMap(){
		map = new char[128];
		//init
		for(int i = 0; i < map.length; i++){
			map[i] = (char)(i);
		}
	}

	public void setConversion(char a, char b){
		map[(int)a] = b;
	}

	public char getConversion(char a){
		return map[(int)a];
	}
}