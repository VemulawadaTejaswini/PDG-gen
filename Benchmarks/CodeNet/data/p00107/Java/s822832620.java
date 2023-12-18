import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static double pythagorean(int x, int y){
		return Math.sqrt((double)(x * x + y * y));
	}

	public static void main(String[] args) throws IOException {

		boolean			hoge = false;
		int 			tmp;
		int[] 			cheeseSize = new int[3];
		int				holeRadius;
		List<Boolean>	holeRadiusEntreFlags = new ArrayList<Boolean>();
		String[]		buff;
		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			buff = reader.readLine().split(" ");
			if(buff.length == 3){
				for(int i = 0; i < 3; i++) cheeseSize[i] = Integer.parseInt(buff[i]);
				if(cheeseSize[0] == cheeseSize[1] && cheeseSize[0] == cheeseSize[2] && cheeseSize[0] == 0){ break;
				}else{
					for(int i = 0; i < 3; i++){
						for(int j = i + 1; j < 3; j++){
							if(cheeseSize[i]< cheeseSize[j] ){
								tmp = cheeseSize[i];
								cheeseSize[i] = cheeseSize[j];
								cheeseSize[j] = tmp;
							}
						}
					}
				}
			}else{
				if(hoge){
					holeRadius = Integer.parseInt(buff[0]) * 2;
					holeRadiusEntreFlags.add(pythagorean(cheeseSize[0], cheeseSize[1]) < holeRadius || pythagorean(cheeseSize[1], cheeseSize[2]) < holeRadius);
				}else{
					hoge = true;
				}
			}
		}

		for(boolean flag : holeRadiusEntreFlags) System.out.println(flag ? "OK" : "NA");
	}
}