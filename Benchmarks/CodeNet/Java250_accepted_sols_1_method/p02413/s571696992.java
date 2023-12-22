
import java.util.Scanner;

/**
 *
 * @author kids
 */
public class Main {
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int vert=scanner.nextInt();
        int horiz=scanner.nextInt();
        
        int table[][]=new int[101][101];
        
        for(int i=0;i<vert;i++){
            for(int j=0;j<horiz;j++){
                table[i][j]=scanner.nextInt();
            }
        }
        
        for(int i=0;i<vert;i++){
            table[i][horiz]=0;
            for(int j=0;j<horiz;j++){
                table[i][horiz]+=table[i][j];
            }
        }
        
        for(int i=0;i<horiz;i++){
            table[vert][i]=0;
            for(int j=0;j<vert;j++){
                table[vert][i]+=table[j][i];
            }
        }
        
        table[vert][horiz]=0;
        for(int i=0;i<horiz;i++){
            table[vert][horiz]+=table[vert][i];
        }
        
        for(int i=0;i<vert+1;i++){
            for(int j=0;j<horiz;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.print(table[i][horiz]+"\n");
        }
        
    }   
     
}