import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
        int[][] h=new int[r+1][c+1];
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String b=" ",n="\n";
        for(int i=0;i<r;i++){
        	for(int j=0;j<c;j++){
        		h[i][j]=sc.nextInt();
        		h[i][c]+=h[i][j];
        		h[r][j]+=h[i][j];
        		h[r][c]+=h[i][j];
        		sb1.append(h[i][j]+b);
        		if(i==r-1) sb2.append(h[r][j]+b);
        	}
        	sb1.append(h[i][c]+n);
        }
        sb2.append(h[r][c]);
        System.out.print(sb1);
        System.out.println(sb2);
	}
}