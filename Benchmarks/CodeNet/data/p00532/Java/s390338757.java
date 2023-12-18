import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] fpoint=new int[n];
        int[] tage=new int[m];
        int[][] who=new int[m][n];
        for(int i=0;i<m;i++){
             tage[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                who[j][i]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(tage[i]==who[i][j]){
                    fpoint[j]++;
                }else{
                    fpoint[tage[i]-1]++;
                }
 
            }
        }
 
        for(int i=0;i<n;i++){
            System.out.printf("%d\n", fpoint[i]);
            }
        }
 
}