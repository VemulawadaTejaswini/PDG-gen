import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	private static int[] datasetint;
	public static void main(String[]arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int count=Integer.parseInt(str);
		for (int i=0;i<=count;i++){
			String[] datasetstr=str.split(" ",3);

			for (int j=0;j<=2;j++){
				datasetint[j]=Integer.parseInt(datasetstr[j]);
			}
			Sort(datasetint);
			Boolean isRight=datasetint[0]==(datasetint[1]^2+datasetint[2]^2);
			if (isRight){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		
		
	}
	private static void Sort(int[] datasetint){
		for (int k=0;k<=1;k++){
			for (int l=k+1;l<=2;l++){
				if(datasetint[k]<datasetint[l]){
					int temporary=datasetint[k];
					datasetint[k]=datasetint[l];
					datasetint[l]=temporary;
				}
			}
		}
	}
}