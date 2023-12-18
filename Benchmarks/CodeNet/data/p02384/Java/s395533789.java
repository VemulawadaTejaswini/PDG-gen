import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sides = new int[6];
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < 6; i++) {
			sides[i] = Integer.parseInt(str[i]);
		}
		int su1 = 0;
		int su2 = 0;
		int num = Integer.parseInt(br.readLine());
		int[] result = new int[num];

		for(int i = 0; i < num; i++){
			str = br.readLine().split(" ");
			su1 = Integer.parseInt(str[0]);
			su2 = Integer.parseInt(str[1]);
			if(sides[0] == su1){//1
				if(sides[1] == su2){
					result[i] = sides[2];
				}else if(sides[2] == su2){
					result[i] = sides[4];
				}else if(sides[3] == su2){
					result[i] = sides[1];
				}else if(sides[4] == su2){
					result[i] = sides[3];
				}
			}
			if(sides[1] == su1){
				if(sides[0] == su2){
					result[i] = sides[3];
				}else if(sides[2] == su2){
					result[i] = sides[0];
				}else if(sides[3] == su2){
					result[i] = sides[5];
				}else if(sides[5] == su2){
					result[i] = sides[2];
				}
			}
			if(sides[2] == su1){
				if(sides[1] == su2){
					result[i] = sides[5];
				}else if(sides[0] == su2){
					result[i] = sides[1];
				}else if(sides[4] == su2){
					result[i] = sides[0];
				}else if(sides[5] == su2){
					result[i] = sides[4];
				}
			}
			if(sides[3] == su1){
				if(sides[1] == su2){
					result[i] = sides[0];
				}else if(sides[0] == su2){
					result[i] = sides[4];
				}else if(sides[4] == su2){
					result[i] = sides[5];
				}else if(sides[5] == su2){
					result[i] = sides[1];
				}
			}
			if(sides[4] == su1){
				if(sides[0] == su2){
					result[i] = sides[2];
				}else if(sides[2] == su2){
					result[i] = sides[5];
				}else if(sides[3] == su2){
					result[i] = sides[0];
				}else if(sides[5] == su2){
					result[i] = sides[3];
				}
			}
			if(sides[5] == su1){
				if(sides[1] == su2){
					result[i] = sides[3];
				}else if(sides[2] == su2){
					result[i] = sides[1];
				}else if(sides[3] == su2){
					result[i] = sides[4];
				}else if(sides[4] == su2){
					result[i] = sides[2];
				}
			}
		}
		for(int i = 0; i < num; i++){
			System.out.println(result[i]);
		}
	}
}