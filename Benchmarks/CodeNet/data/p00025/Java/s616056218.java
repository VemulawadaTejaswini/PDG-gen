import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main{
	public static void main(String[] args){
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		StringBuilder stringBuilder = new StringBuilder();
		
		try{
			String dataSet;
			int[][] intArray = new int[2][4];
			int index = 0;
			while((dataSet=bufferedReader.readLine())!=null){
				if(dataSet.length()==0) break;
				String[] stringArray = dataSet.split(" ");
				intArray[index] = Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
				if(index==1){
					int[] result = hitBlow(intArray[0], intArray[1]);
					stringBuilder.append(result[0] + " " + result[1] + "\n");
					index = 0;
				}else
					++index;
			}
			System.out.print(stringBuilder);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	static int[] hitBlow(int[] a, int[] n){
		int hit = 0;
		int blow = 0;
		for(int i=0; i<4; i++){
			int key = a[i];
			for(int j=0; j<4; j++){
				if(key==n[j]){
					if(i==j){
						++hit;
					}else{
						++blow;
					}
				}
			}
		}
		int[] result = {hit, blow};
		return result;
	}
}