import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		boolean conte=true;
		boolean[][] c=new boolean[H][W];
		int[][] field=new int[H][W];
		String[] str=new String[H];
		for(int i=0;i<H;i++){
			str[i]=sc.next();
			for(int k=0;k<W;k++){
				 field[i][k]=-1;
				 c[i][k]=false;
			 }
		}
		sc.close();
		for(int i=0;i<H;i++){
			int j=0;
			conte=true;
			 while(conte && j< str[i].length()){
				 if(str[i].indexOf('c',j) == -1){
					 conte=false; 
				 }else{
					 c[i][str[i].indexOf('c',j)]=true;
					 field[i][str[i].indexOf('c',j)]=0;
					 j=str[i].indexOf('c',j);
				 }
				 j++;
			 }
		}
		for(int i=0;i<H;i++){
			 for(int k=0;k<W-1;k++){
				 if(c[i][k]==true && c[i][k+1]==false){
					 field[i][k+1]=field[i][k]+1;
					 c[i][k+1]=true;
				 }
			 }	 
		}
		for(int i=0;i<H;i++){
			for (int k=0;k<W-1;k++){
				System.out.printf("%d ", field[i][k]);
			}
				System.out.printf("%d\n",field[i][W-1]);
		}
		
		
		
		
		
		
	}

}