import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r = scanner.nextInt();
        int c = scanner.nextInt(); 

        int[][] sumArr = new int[r][c+1];
        int[] sumCArr = new int[c+1];
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++){
                sumArr[i][j] = scanner.nextInt();
            }
        }
        
        for(int i=0; i<r; i++) {
            int sum = 0;
            for(int j=0; j<=c; j++){
                if(j != c){
                    sum += sumArr[i][j];
                    sumCArr[j] += sumArr[i][j];
                } else {
                    sumArr[i][j] = sum;
                }
                
            }
            sumCArr[c] += sum;
        }
        

        for(int i=0; i<r; i++) {
            for(int j=0; j<=c; j++){
                if(j != c){
                    System.out.print(sumArr[i][j] + " ");
                } else {
                    System.out.println(sumArr[i][j]);
                }
            }
        }
        

        for(int i=0; i<c+1;i++ ){
            if(i != c){
                System.out.print(sumCArr[i] + " ");
            } else {
                System.out.println(sumCArr[i]);
            }

        }
    }
}
