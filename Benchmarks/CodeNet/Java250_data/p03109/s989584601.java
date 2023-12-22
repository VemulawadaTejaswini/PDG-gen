import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String [] ymd = S.split("/");
        int[] ymd_num = new int[ymd.length];
        int cont = 0;
        for (String t:ymd){
            ymd_num[cont] = Integer.parseInt(t);
            cont = cont + 1;
        }
        if (ymd_num[0] <= 2018){
            System.out.println("Heisei");
        } else if (ymd_num[0] == 2019 && ymd_num[1] <= 4){
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}