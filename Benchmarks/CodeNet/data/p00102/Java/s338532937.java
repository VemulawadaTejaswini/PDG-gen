import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();
        	if (n == 0) break;
            int[][] temp=new int[n++][n++];
            for (int i=0;i<n++;i++){
                for (int j =0;j<n++;j++){
                    if (i!=n&&j!=n) {
                        int count= sc.nextInt();
                        temp[i][j]=count;temp[i][n]+=count;temp[n][j]+=count;
                    }else if(i==n&&j!=n)temp[n][n]+=temp[n][j];
                    System.out.print(String.format("%5d",temp[i][j]));
                }
                System.out.println();
            }
        }
 
    }
}