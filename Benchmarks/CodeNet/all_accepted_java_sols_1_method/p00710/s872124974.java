import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int[] huda=new int[50];
		int[] hud2=new int[50];
		int[] hud3=new int[50];

		while(true){
			int n=s.nextInt();
			int r=s.nextInt();
			if(r==0&&n==0){
				break;
			}
			for(int i=0;i<n;i++){
				huda[i]=n-i;
			}
			for(int i=0;i<r;i++){
				int p=s.nextInt();
				int c=s.nextInt();

				if(p==1){
					continue;
				}
				for(int k=0;k<(c+p-1);k++){
					hud2[k]=huda[k];
				}

				for(int k=0;k<c;k++){
					//hud2[k]=huda[k];
					huda[k]=huda[p-1+k];
				}
				for(int k=0;k<p-1;k++){
					//hud3[k]=huda[c+k];
					huda[c+k]=hud2[k];
				}
				for(int k=0;k<(p-1+c-2*c);k++){

				}




				for(int j=0;j<n;j++){
		//			System.out.println(huda[j]+"..");
				}
			}
			System.out.println(huda[0]);
		}
	}
}