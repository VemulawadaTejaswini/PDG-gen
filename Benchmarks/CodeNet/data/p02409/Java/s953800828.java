import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][][] data=new int[4][3][10];
	for(int i=0;i<n;i++){
	    int b=sc.nextInt();
	    int f=sc.nextInt();
	    int r=sc.nextInt();
	    int v=sc.nextInt();
	    data[b-1][f-1][r-1]+=v;
	}
	for(int k=0;k<4;k++){
	for(int i=0;i<3;i++){
	    for(int j=0;j<10;j++){
		System.out.print(" "+data[k][i][j]);
	    }
	    System.out.println();
	}
	if(k!=3)
	System.out.println("####################");
	}
    
    }
}

