import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] Ar=new int[r+1][c+1];
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
		Ar[i][j]=sc.nextInt();
		Ar[i][c]+=Ar[i][j];
		Ar[r][j]+=Ar[i][j];
		Ar[r][c]+=Ar[i][j];
	    }
	}
	for(int i=0;i<=r;i++){
	    for(int j=0;j<=c;j++){
		System.out.print(Ar[i][j]);
		if(j!=c) System.out.print(" ");
	    }
	    System.out.println("");
	}
    }
}