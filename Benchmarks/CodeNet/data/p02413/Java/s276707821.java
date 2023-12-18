import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c =sc.nextInt();
        
        int[][] array = new int[r+1][c+1];
        int[] sum = new int[c+1];
        
        for(int i=0;i<r;i++){
            
            for(int j = 0;j<c;j++){
                
                array[i][j] = sc.nextInt();
            }
        }
         for(int i=0;i<r;i++){
             int k =0;
            for(int j = 0;j<c;j++){
			System.out.print(array[i][j]);
            k += array[i][j];
            sum[j] += array[i][j];
                if(j!=c)System.out.print(" ");
	            }
             sum[c] += k;
             System.out.println(k);
             }
        for(int numb = 0; numb<c+1;numb++){
                 System.out.print(sum[numb]);
                  if(numb!=c)System.out.print(" ");
         }
        System.out.println();
        sc.close();
    }
}
