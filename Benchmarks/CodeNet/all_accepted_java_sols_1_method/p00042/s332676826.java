import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int w,n,c=0;
		String str;
		while((w = Integer.parseInt(bf.readLine()))>0){
			n = Integer.parseInt(bf.readLine());
			int[] weight = new int[n+1];
			int[] value = new int[n+1];
			int[][] ans_a = new int[n+1][w+1];
			int[][] ans_b = new int[n+1][w+1];
			weight[0]=0;value[0]=0;
			for(int i=1;i<=n;i++){
				str=bf.readLine();;
				value[i]=Integer.parseInt(str.split(",")[0]);
				weight[i]=Integer.parseInt(str.split(",")[1]);
			}
			for(int j=0;j<=w;j++)ans_a[0][j]=0;
			for(int i=1;i<=n;i++){
				for(int j=0;j<weight[i];j++){
					ans_a[i][j]=ans_a[i-1][j];
					ans_b[i][j]=ans_b[i-1][j];
				}
				for(int j=weight[i];j<=w;j++){
					ans_a[i][j]=Math.max(ans_a[i-1][j],ans_a[i-1][j-weight[i]]+value[i]);
					ans_b[i][j]=(ans_a[i-1][j]>ans_a[i-1][j-weight[i]]+value[i])?(ans_b[i-1][j]):(ans_b[i-1][j-weight[i]]+weight[i]);
				}
			}
			System.out.println("Case "+(++c)+":");
			System.out.println(ans_a[n][w]);
			System.out.println(ans_b[n][w]);
		}
	}
}