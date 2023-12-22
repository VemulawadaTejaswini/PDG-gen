import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] card = new int[4][13];

        int sheets = Integer.parseInt(br.readLine());
        for(int i=0; i<sheets; i++){
            String[] str = br.readLine().split(" ");
            int num = Integer.parseInt(str[1]);
            if(str[0].equals("S")){
                card[0][num-1] = 1;
            }else if(str[0].equals("H")){
                card[1][num-1] = 1;
            }else if(str[0].equals("C")){
                card[2][num-1] = 1;
            }else if(str[0].equals("D")){
                card[3][num-1] = 1;
            }else break;
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                if( card[i][j] == 0){
                    if(i == 0){
                        sb.append("S");
                    }else if(i == 1){
                        sb.append("H");
                    }else if(i == 2){
                        sb.append("C");
                    }else if(i == 3){
                        sb.append("D");
                    }
                    sb.append(" ").append(j+1).append("\n");
                }
            }
        }
        System.out.print(sb);

    }
}