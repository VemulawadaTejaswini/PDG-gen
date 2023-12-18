import java.util.Scanner;


public class Main {

	private static int[] value = new int[10];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=0;i<n;i++){
			for(int j=0;j<10;j++){
				value[j] = sc.nextInt();
			}

			System.out.println(dfs(0,0,0));
		}
	}

	@SuppressWarnings("unused")
	private static String dfs(int left,int right,int i){
		if(i == 10) return "YES";
		if(left < value[i])
		{
			return dfs(value[i],right,i+1);
		}
		if(right < value[i])
		{
			return dfs(left,value[i],i+1);
		}

		return  "NO";
	}
}