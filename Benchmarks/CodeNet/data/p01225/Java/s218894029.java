import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int x[][]=new int[3][9];
          int y[]=new int[9];
         while((n--)!=0){
            int count=0;
             for(int i=0;i<3;i++){
                 for(int j=0;j<9;j++){
                     x[i][j]=0;
                 }
             }
             for(int i=0;i<9;i++){
                 y[i]=sc.nextInt();
                 y[i]--;
             }
             for(int i=0;i<9;i++){
                String a=sc.next();
                if(a.equals("R"))x[0][y[i]]++;
                if(a.equals("G"))x[1][y[i]]++;
                if(a.equals("B"))x[2][y[i]]++;
            }
           
            for(int i=0;i<3;i++){
                for(int j=0;j<7;j++){
                    if(x[i][j]>=1&&x[i][j+1]>=1&&x[i][j+2]>=1){
                        x[i][j]--;x[i][j+1]--;x[i][j+2]--;
                        count++;
                        j--;
                    }
                    }
                }
                    for(int i=0;i<3;i++){
                        for(int j=0;j<9;j++){
                            if(x[i][j]==3){
                                x[i][j]-=3;
                                count++;
                            }
                        }
                    }
                        if(count==3)System.out.println(1);
                        else System.out.println(0);
            }
            
         
}
}

