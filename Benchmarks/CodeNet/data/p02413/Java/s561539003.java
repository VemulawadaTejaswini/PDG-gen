import java.*;
import java.util.*;

public class Main{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int nrow, ncol;
	spreadsheet sp=new spreadsheet(nrow=scan.nextInt(),ncol=scan.nextInt());
	for(int i=0;i<nrow;i++)
		for(int j=0;j<ncol;j++)
			sp.load(i,j,scan.nextInt());
	sp.rowSum();
	sp.colSum();
	sp.show();
	}
}
class spreadsheet{
	int nrow;
	int ncol;
	int[][] cells;
	public spreadsheet(int r, int c){
		nrow=r;
		ncol=c;
		cells = new int[nrow+1][ncol+1];
	}
	public void load(int i, int j, int n){
		cells[i][j]=n;
	}
	public void rowSum(){
		for(int i=0; i< nrow; i++){
			int sum=0;
			for(int j=0;j<ncol;j++)
				sum+=cells[i][j];
			cells[i][ncol]=sum;
		}
	}
	public void colSum(){
		for(int j=0; j<= ncol; j++){
			int sum=0;
			for(int i=0;i<nrow;i++)
				sum+=cells[i][j];
			cells[nrow][j]=sum;
		}
	}
	public void show(){
		for(int i=0; i<= nrow; i++){
			for(int j=0;j<=ncol;j++){
				if(j==0)
				System.out.printf("%d",cells[i][j]);
				else
				System.out.printf(" %d",cells[i][j]);
			}
			System.out.printf("\n");
		}
	}
}