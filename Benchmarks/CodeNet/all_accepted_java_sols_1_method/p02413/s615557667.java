import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		//入力導入部
		Scanner sc=new Scanner(System.in);
		
			int r=sc.nextInt();
			int c=sc.nextInt();
			int[][] box=new int[r+1][c+1];
			///////////////////////////////////////////////////////////////////
			//計算部			x=n+n-i+n-l
			int total;
		
			for(int i=0;i<r;i++){total=0;
				for(int l=0;l<c+1;l++){
					if(l==c){box[i][c]=total;
					}else total+=box[i][l]=sc.nextInt();
					
					
				}
				
			}
			for(int l=0;l<=c;l++){total=0;
				for(int i=0;i<r+1;i++){
					if(i==r){box[r][l]=total;}
					else{total+=box[i][l];}
			
				}
			}
			for(int i=0;i<r+1;i++){
				for(int l=0;l<c+1;l++){
					if(l==0)System.out.print(box[i][0]);
					else System.out.print(" "+box[i][l]);
				}System.out.println();
			}
			
			
		}}	