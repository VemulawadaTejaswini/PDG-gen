import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] intTouA=new int[3][10];
        int[][] intTouB=new int[3][10];
        int[][] intTouC=new int[3][10];
        int[][] intTouD=new int[3][10];
        for(int i=0; i<3;i++){
            for(int j=0; j<10;j++){
            intTouA[i][j]=0;
            intTouB[i][j]=0;
            intTouC[i][j]=0;
            intTouD[i][j]=0;
            }
        }
        int a=scanner.nextInt();
        for(int i=0; i<a;i++){
            int tou=scanner.nextInt();
            int kai=scanner.nextInt();
            int ban=scanner.nextInt();
            int ninzu=scanner.nextInt();
            
            if(tou==1){
                intTouA[(kai-1)][(ban-1)]+=ninzu;
            }
            if(tou==2){
                intTouB[(kai-1)][(ban-1)]+=ninzu;
            }
            if(tou==3){
                intTouC[(kai-1)][(ban-1)]+=ninzu;
            }
            if(tou==4){
                intTouD[(kai-1)][(ban-1)]+=ninzu;
            }
        }
        
        for(int i=0; i<3;i++){
            for(int j=0; j<10;j++){
                System.out.print(" "+intTouA[i][j]);
            }
            System.out.println("");
        }
        System.out.println("####################");
        for(int i=0; i<3;i++){
            for(int j=0; j<10;j++){
                System.out.print(" "+intTouB[i][j]);
            }
            System.out.println("");
        }
        System.out.println("####################");
        for(int i=0; i<3;i++){
            for(int j=0; j<10;j++){
                System.out.print(" "+intTouC[i][j]);
            }
            System.out.println("");
        }
        System.out.println("####################");
        for(int i=0; i<3;i++){
            for(int j=0; j<10;j++){
                System.out.print(" "+intTouD[i][j]);
            }
            System.out.println("");
        }
    }
}