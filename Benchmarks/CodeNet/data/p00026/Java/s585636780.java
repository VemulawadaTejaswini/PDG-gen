import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Paper paper = new Paper();
		while(true){
			String tmpStr = br.readLine();

			if(tmpStr == null){
				break;
			}

			String[] tmpArray = tmpStr.split(",");
			paper.dropInk(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]), Integer.parseInt(tmpArray[2]));
		}
		System.out.println(paper.countBlank());
		System.out.println(paper.findMax());

	}

}

class Paper {
	int[][] square;

	public Paper() {
		square = new int[10][10];
	}

	public void dropInk(int x, int y, int size){
		square[x][y]++;
		if(x - 1 >= 0) square[x - 1][y]++;
		if(x + 1 < 10) square[x + 1][y]++;
		if(y - 1 >= 0) square[x][y - 1]++;
		if(y + 1 < 10) square[x][y + 1]++;

		if(size == 2 || size == 3){
			if(x - 1 >= 0 && y - 1 >= 0) square[x - 1][y - 1]++;
			if(x + 1 < 10 && y + 1 < 10) square[x + 1][y + 1]++;
			if(x - 1 >= 0 && y + 1 < 10) square[x - 1][y + 1]++;
			if(x + 1 < 10 && y - 1 >= 0) square[x + 1][y - 1]++;
		}

		if(size == 3){
			if(x - 2 >= 0) square[x - 2][y]++;
			if(x + 2 < 10) square[x + 2][y]++;
			if(y - 2 >= 0) square[x][y - 2]++;
			if(y + 2 < 10) square[x][y + 2]++;
		}
	}

	public int countBlank(){
		int result = 0;
		for(int i = 0; i < 10 ; i++){
			for(int j = 0; j < 10 ; j++){
				if(square[i][j] == 0){
					result++;
				}
			}
		}

		return result;
	}

	public int findMax(){
		int max = 0;
		for(int i = 0; i < 10 ; i++){
			for(int j = 0; j < 10 ; j++){
				if(square[i][j] > max){
					max = square[i][j];
				}
			}
		}

		return max;

	}
}