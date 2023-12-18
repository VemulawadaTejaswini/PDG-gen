import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strs = str.split(" ");
        int min = 0;//最小
        int max = 0;//最大
        long sum = 0;//合計
        if(strs.length > 0){
            min = Integer.parseInt(strs[0]);
            max = Integer.parseInt(strs[0]);
        }
        for(int i = 0; i < n; i++){
            if(min > Integer.parseInt(strs[i])){
                min = Integer.parseInt(strs[i]);
            }else if(max < Integer.parseInt(strs[i])){
                max = Integer.parseInt(strs[i]);
            }//if
            sum += Integer.parseInt(strs[i]);
        }//for
        System.out.println(min + " " + max + " " + sum);
	}
}