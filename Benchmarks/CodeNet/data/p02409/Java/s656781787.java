import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int a=Integer.parseInt(bf.readLine());
        int[][][] num=new int[4][3][10];
        
        for(int i=0;i<a;i++){
            String[] str=bf.readLine().split(" ");
            int b=Integer.parseInt(str[0]);
            int f=Integer.parseInt(str[1]);
            int r=Integer.parseInt(str[2]);
            int v=Integer.parseInt(str[3]);
            
            num[b-1][f-1][r-1]+=v;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    System.out.print(" "+num[i][j][k]);
            }
                System.out.println();
        }
            if(i !=3)
                System.out.println("####################");
        }
    }
}