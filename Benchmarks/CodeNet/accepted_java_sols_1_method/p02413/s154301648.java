import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str1 = br.readLine().split(" ");
        int r = Integer.parseInt(str1[0]);
        int c = Integer.parseInt(str1[1]);
        int[][] data = new int[r][c];
        int[] sumR = new int[r];
        int[] sumC = new int[c];
        int sumX = 0;

        // r x c ????????????????¨??????\???????????????????´???????
        for(int i=0; i<r; i++){
            String[] str2 = br.readLine().split(" ");
            for(int k=0; k<c; k++){
                data[i][k] = Integer.parseInt(str2[k]);
            }
        }

        // ????¨????sumR????¨??????????
        for(int i=0; i<r; i++){
            for(int k=0; k<c; k++){
                sumR[i] += data[i][k];
            }
            sumX += sumR[i];
        }
        // ????¨????sumC????¨??????????
        for(int i=0; i<c; i++){
            for(int k=0; k<r; k++){
                sumC[i] += data[k][i];
            }
        }

        //??????
        for(int i=0; i<r; i++){
            for(int k=0; k<c; k++){
                sb.append(data[i][k]).append(" ");
            }
            sb.append(sumR[i]).append("\n");
        }
        for(int k=0; k<c; k++){
            sb.append(sumC[k]).append(" ");
        }
        sb.append(sumX).append("\n");

        System.out.print(sb);
    }
}