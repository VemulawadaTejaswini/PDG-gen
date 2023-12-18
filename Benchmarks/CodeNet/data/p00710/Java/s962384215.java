import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int[] huda=new int[50];
		int[] hud2=new int[50];

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

				for(int j=0;j<c;j++){
					hud2[j]=huda[j];
					huda[j]=huda[p-1+j];
					System.out.println(hud2[j]+"...");
				}
				hud2[c]=huda[p-2];
				for(int j=0;j<p-1;j++){
					huda[c+j]=hud2[j];
				}

				for(int j=0;j<n;j++){
					System.out.println(huda[j]+"..");
				}
			}
			System.out.println(huda[0]);
		}
	}
}