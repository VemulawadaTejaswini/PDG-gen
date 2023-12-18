import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//日数
		int k=sc.nextInt();//パスタの種類が決まっている日数
		int pattern=0;
		int pasta[][] = new int[n][6];
		int menuplan[]=new int[n];
		for(int i=0;i<k;i++){
			int a=sc.nextInt();
			menuplan[a-1]=sc.nextInt();//パスタの種類
		}
		if(menuplan[0]==0){
			pasta[0][1]=1;
			pasta[0][3]=1;
			pasta[0][5]=1;
		}
		else if(menuplan[0]==1){
			pasta[0][1]=1;
		}
		else if(menuplan[0]==2){
			pasta[0][3]=1;
		}
		else if(menuplan[0]==3){
			pasta[0][5]=1;
		}
		for(int i=1;i<n;i++){
			if(menuplan[i]==0){
				pasta[i][0]=pasta[i-1][1];
				pasta[i][2]=pasta[i-1][3];
				pasta[i][4]=pasta[i-1][5];
				pasta[i][1]=pasta[i-1][2]+pasta[i-1][3]+pasta[i-1][4]+pasta[i-1][5];
				pasta[i][3]=pasta[i-1][0]+pasta[i-1][1]+pasta[i-1][4]+pasta[i-1][5];
				pasta[i][5]=pasta[i-1][0]+pasta[i-1][1]+pasta[i-1][2]+pasta[i-1][3];
			}
			else if(menuplan[i]==1){
				pasta[i][0]=pasta[i-1][1];
				pasta[i][1]=pasta[i-1][2]+pasta[i-1][3]+pasta[i-1][4]+pasta[i-1][5];
			}
			else if(menuplan[i]==2){
				pasta[i][2]=pasta[i-1][3];
				pasta[i][3]=pasta[i-1][0]+pasta[i-1][1]+pasta[i-1][4]+pasta[i-1][5];
			}
			else{
				pasta[i][4]=pasta[i-1][5];
				pasta[i][5]=pasta[i-1][0]+pasta[i-1][1]+pasta[i-1][2]+pasta[i-1][3];
			}
		}
		
		for(int i=0;i<6;i++){
			pattern += pasta[n-1][i];
		}
		System.out.println(pattern%10000);
		
		
		
		
	}

}