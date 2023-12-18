import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum=0;
        int sum2=0;
        
        int[][] array = new int[r][c];
        
        for(int i=0; i<r ; i++){
            for(int j=0; j<c ; j++){
                array[i][j]=sc.nextInt();
                if(j==0){
                    System.out.print(array[i][j]);
                }else{
                    System.out.print(" "+array[i][j]);
                }
                sum+=array[i][j];
            }
             System.out.println(" "+sum);
            sum=0;
        }
        for(int j=0; j<c ; j++){
            for(int i=0; i<r ; i++){
                sum2+=array[i][j];
            }
                if(j==0){
                    System.out.print(sum2);
                }else{
                    System.out.print(" "+sum2);
                }
                sum+=sum2;
                sum2=0;
        }
        
             System.out.println(" "+sum);
            sum=0;
        
        sc.close();
    }
}
