import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();	
			int k=sc.nextInt();
			if(n==0&&k==0)break;
			int blood[]=new int [k];
			for(int i=0;i<k;i++)
				blood[i]=sc.nextInt();
			int vamp_b[][]=new int[n][k];
			int max_b[]=new int[k];
			for(int i=0;i<n;i++){
				for(int j=0;j<k;j++){
					vamp_b[i][j]=sc.nextInt();
					max_b[j]+=vamp_b[i][j];
				}
			}
			String ans="Yes";
			for(int i=0;i<k;i++){
				if(max_b[i]>blood[i])ans="No";
//				System.out.println(max_b[i]+" "+blood[i]);
			}
			System.out.println(ans);
			
		
		
		}
	}
}