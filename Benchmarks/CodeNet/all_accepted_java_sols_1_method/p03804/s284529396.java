import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M  = sc.nextInt();

        char templateA[][] = new char[N][N];
        char templateB[][] = new char[M][M];

        for(int i=0;i<N;i++){
            String tmp = sc.next();
            for(int j=0;j<N;j++){
                templateA[i][j] = tmp.charAt(j);
            }
        }


        for(int i=0;i<M;i++){
            String tmp = sc.next();
            for(int j=0;j<M;j++){
                templateB[i][j] = tmp.charAt(j);
            }
        }

        boolean foundFlag = false;
        for(int i =0;i<=N-M&&!foundFlag;i++){
            for(int j=0;j<=N-M&&!foundFlag;j++){
                boolean same = true;
                for(int k=0;k<M&&same;k++){
                    for(int l=0;l<M&&same;l++){
                        if(templateA[i+k][j+l]!=templateB[k][l]){
                            same = false;
                        }
                    }
                }
                if(same) foundFlag = true;
            }
        }

        if (foundFlag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();
    }

}