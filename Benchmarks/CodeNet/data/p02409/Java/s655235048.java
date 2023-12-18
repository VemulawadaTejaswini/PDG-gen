import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int[] data = makeIntArray(br);
        int n = data[0];
        int[][][] House = new int[4][3][10];
        int i, j, k;
        for(i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                for(k = 0; k < 10; k++) House[i][j][k] = 0;
            }
        }
        for(i = 0; i < n; i++){
            data = makeIntArray(br);
            House[data[0] - 1][data[1] - 1][data[2] - 1] += data[3];
        }
        for(i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                for(k = 0; k < 10; k++){ System.out.print(" " + House[i][j][k]); }
                System.out.println();
            }
            if(i < 3){
                for(k = 0; k < 20; k++){ System.out.print('#'); }
                System.out.println();
            }
        }
    }
    public static int[] makeIntArray(BufferedReader br) throws IOException
    {
        String[] str = br.readLine().split(" ");
        int n = str.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){ a[i] = Integer.parseInt(str[i]); }
        return a;
    }
}
