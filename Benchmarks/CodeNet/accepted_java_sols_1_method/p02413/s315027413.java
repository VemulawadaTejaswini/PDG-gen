import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int n=0,rowSum=0;
        int[] colSum = new int[col];
        for(int i=0; i<=row; i++){
            for(int j=0; j<col; j++){
            	if(i!=row) {
            		n = sc.nextInt();
            		rowSum += n;
            		colSum[j] += n;
            		System.out.print(n +" ");
            	}else {
            		System.out.print(colSum[j] +" ");
            		rowSum += colSum[j];
            	}
            }
            System.out.println(rowSum);
            rowSum = 0;
        }
    }
}
