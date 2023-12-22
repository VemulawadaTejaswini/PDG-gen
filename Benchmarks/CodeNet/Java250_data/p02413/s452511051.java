import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	Scanner in =new Scanner(System.in);

	int r,c;

	r = in.nextInt();
	c = in.nextInt();

	int[][] table = new int[r+1][c+1];

	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
		table[i][j] = in.nextInt();
	    }
	}

	//0で初期化
	for(int i=0;i<r;i++){
	    table[i][c]=0;
	}
	for(int j=0;j<c;j++){
	    table[r][j]=0;
	}
	table[r][c]=0;
	
	//行の合計
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        table[i][c]+=table[i][j];
	    }
	}
	//列の合計
	for(int j=0;j<c;j++){
	    for(int i=0;i<r;i++){
	        table[r][j]+=table[i][j];
	    }
	}
	//全要素の合計
	for(int i=0;i<r;i++){
	    table[r][c]+=table[i][c];
	}


	for(int i=0;i<=r;i++){
	    for(int j=0;j<=c;j++){
		System.out.print(table[i][j]);
		if(j!=c)System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}
	
