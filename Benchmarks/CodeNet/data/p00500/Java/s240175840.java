import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			UniqueNumber un = new UniqueNumber(n);
			un.input(scan,n);
			un.point(n);
			un.output(n);
		}
	}
}

class UniqueNumber{
	int[][] myNumber;
	int[] myPoint;
	
	public UniqueNumber(int n){
		myNumber = new int[n][3];
		myPoint = new int[n];
		for(int i=0;i<n;i++){
			myPoint[i] = 0;
		}
	}
	
	public void input(Scanner scan,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				myNumber[i][j] = scan.nextInt();
			}
		}
	}
	
	public void output(int n){
		for(int i=0;i<n;i++){
			System.out.println(myPoint[i]);
		}
	}
	
	public void point(int n){
		boolean flag;
		for(int i=0;i<3;i++){
			for(int j=0;j<n;j++){
				flag = true;
				for(int k=0;k<n;k++){
					if(j!=k){
						if(myNumber[j][i]==myNumber[k][i]){
							flag = false;
							break;
						}
					}
				}
				if(flag){
					myPoint[j] += myNumber[j][i];
				}
			}
		}
	}
}