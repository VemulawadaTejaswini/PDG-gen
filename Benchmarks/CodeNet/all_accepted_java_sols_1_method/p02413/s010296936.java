import java.util.Scanner;
	class Main {
	public static void main(String[] args){
        
		Scanner s = new Scanner(System.in);
		int i,j,r,c,n;
        
                  r=s.nextInt();
      			  c=s.nextInt();
        int[][] sam=new int[r+1][c+1];
      
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                sam[i][j]=n=s.nextInt();
                sam[i][c]+=sam[i][j];
                sam[r][j]+=sam[i][j];
                sam[r][c]+=sam[i][j];
            }
        }
        for(i=0;i<r+1;i++){
            for(j=0;j<c+1;j++){
               System.out.print(sam[i][j]);
                if(j!=c)System.out.print(" ");
            }
            System.out.println();
        }
	}
}
