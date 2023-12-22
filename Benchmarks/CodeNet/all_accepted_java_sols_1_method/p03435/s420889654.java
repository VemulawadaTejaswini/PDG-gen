
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int c[][]=new int[4][4];
        int a1=1,a2,a3,b1=1,b2,b3;
        for(int i=1;i<=3;i++)
            for(int j=1;j<=3;j++){
                c[i][j]=sc.nextInt();
            }
        int row1=c[1][1]+c[1][2]+c[1][3];
        int row2=c[2][1]+c[2][2]+c[2][3];
        int row3=c[3][1]+c[3][2]+c[3][3];
        int col1=c[1][1]+c[2][1]+c[3][1];
        int col2=c[1][2]+c[2][2]+c[3][2];
        int col3=c[1][3]+c[2][3]+c[3][3];
        if((row2-row1)%3!=0||(row3-row2)%3!=0||(row3-row1)%3!=0||(col2-col1)%3!=0||(col3-col2)%3!=0||(col3-col1)%3!=0){
            System.out.println("No");
        }
        else{
        a2=(row2-row1)/3+a1;
        a3=(row3-row2)/3+a2;
        b2=(col2-col1)/3+b1;
        b3=(col3-col2)/3+b2;
        if(a3-a1==(row3-row1)/3&&b3-b1==(col3-col1)/3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        }
    }
    
}
