import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int po[][] = new int[n][3];
	for(int i=0;i<n;i++){
		for(int j=0;j<3;j++){
			po[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<n;i++){
		int p=0;
		for(int j=0;j<3;j++){
			int c=0;
			for(int k=0;k<n;k++){
				if(po[i][j]==po[k][j]){
					c++;
				}
			}
			if(c==1){
				p+=po[i][j];
			}
		}
		System.out.println(p);
	}
	}
}