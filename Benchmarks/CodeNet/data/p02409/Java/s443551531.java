import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int [][][] office = new int[4][3][10];
        int b=0,f=0,r=0,v=0,count=0;
        
        
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            b=scn.nextInt();
            f=scn.nextInt();
            r=scn.nextInt();
            v=scn.nextInt();
            office[b-1][f-1][r-1]+=v;
          
        }
        
        build(0,office);
        build(1,office);
        build(2,office);
        build(3,office);
        
    }


    private static void build(int count_b, int [][][] office_b) {
       for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                if(office_b[count_b][i][j]==0){
                    System.out.print(" "+0);
                }else{
                    System.out.print(" "+office_b[count_b][i][j]);
                }
                                
            }
        
                System.out.println("");
           
       }
       if(count_b!=3){
           System.out.println("####################");
       }
    }
    
}