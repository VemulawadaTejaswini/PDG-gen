import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by macbookpro on 2017/07/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] gem =new int[21][21];
        for(int[] i: gem) {
            Arrays.fill(i, 0);
        }

        while(true){
            String line=sc.nextLine();
            int N=Integer.parseInt(line);

            if(N==0){
                break;
            }

            for(int i=0; i<N; i++){
                String[] line2=sc.nextLine().split(" ");
                int x=Integer.parseInt(line2[0]);
                int y=Integer.parseInt(line2[1]);
                System.out.println(x+":"+y);
                gem[x][y]=1;
            }
            String line3=sc.nextLine();
            int M=Integer.parseInt(line3);
            int nx=10;
            int ny=10;
            int counter=0;

            for(int i=0; i<M; i++){
                String[] line4=sc.nextLine().split(" ");
                int move=Integer.parseInt(line4[1]);

                if(line4[0].equals("N")){
                    for(int j=0; j<move; j++){
                        ny++;
                        counter+=gem[nx][ny];
                        gem[nx][ny]=0;
                    }
                }else if(line4[0].equals("E")){
                    for(int j=0; j<move; j++){
                        nx++;
                        counter+=gem[nx][ny];
                        gem[nx][ny]=0;
                    }
                }else if(line4[0].equals("S")){
                    for(int j=0; j<move; j++){
                        ny--;
                        counter+=gem[nx][ny];
                        gem[nx][ny]=0;
                    }
                }else{
                    for(int j=0; j<move; j++){
                        nx--;
                        counter+=gem[nx][ny];
                        gem[nx][ny]=0;
                    }
                }
            }
            if(counter==N) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
}