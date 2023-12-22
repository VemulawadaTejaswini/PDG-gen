import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String[] str_1 = str1.split(" ");
        String str2 = br.readLine();
        String[] str_2 = str2.split(" ");
        int[] HW = new int[2];
        int[] hw = new int[2];
        for (int i=0;i<2;i++){
            HW[i] = Integer.parseInt(str_1[i]);
            hw[i] = Integer.parseInt(str_2[i]);
        }
        System.out.println((HW[0]-hw[0])*(HW[1]-hw[1]));
    }
}