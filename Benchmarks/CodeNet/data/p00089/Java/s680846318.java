import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = null;
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		try{
			 br = new BufferedReader(new InputStreamReader(System.in));
			 String str;
			 int a = 0;
			 while((str = br.readLine())!=null){

				 String[] dataset =str.split(",");
				 List<Integer> tmp = new ArrayList<Integer>();
				 for(int i = 0 ; i < dataset.length;i++)
					 tmp.add(new Integer(dataset[i]));
				 matrix.add(tmp);
				 if(a++ ==8) break;
			 }
		}finally{
			if(br !=null){
				br.close();
			}
		}
		int n = matrix.size();
		int[][] sum = new int[n][];
		sum[0] = new int[1];
		sum[0][0] = matrix.get(0).get(0);
		for(int i = 1 ; i < n;i++){
			int m = matrix.get(i).size();
			sum[i] = new int[m];
			for(int j = 0 ; j < m;j++){
				if(i < n / 2 + n % 2){
					if(j == 0){
						sum[i][j] = sum[i - 1][j] + matrix.get(i).get(j);
					}else if(j == m -1){
						sum[i][j] = sum[i - 1][j - 1] + matrix.get(i).get(j);
					}else{
						sum[i][j] = Math.max(sum[i - 1][j - 1], sum[i -1][j]) + matrix.get(i).get(j);
					}
				}else{
					sum[i][j] = matrix.get(i).get(j) + Math.max(sum[i - 1][j], sum[i - 1][j + 1]);
				}
			}
		}
		System.out.println(sum[sum.length - 1][0]);
	}
}