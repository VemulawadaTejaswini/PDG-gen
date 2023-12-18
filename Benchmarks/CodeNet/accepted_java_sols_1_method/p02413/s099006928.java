import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r,c;
		String str;
		String strs[];
		try {
			str = br.readLine();
			strs=str.split(" ");
			r=Integer.parseInt(strs[0]);
			c=Integer.parseInt(strs[1]);
			int total[]=new int[c+1];
			for(int i=0;i<r;i++){
				int sum=0;
				str=br.readLine();
				strs=str.split(" ");
				for(int j=0;j<c;j++){
					sum+=Integer.parseInt(strs[j]);
					total[j]+=Integer.parseInt(strs[j]);
					sb.append(strs[j]).append(" ");
				}
				total[c]+=sum;
				sb.append(sum);
				sb.append("\n");
			}
			for(int i=0;i<c+1;i++){
				if(i != 0){
					sb.append(" ");
				}
				sb.append(total[i]);
			}
			System.out.println(sb);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}