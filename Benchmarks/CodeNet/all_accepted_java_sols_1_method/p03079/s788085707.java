import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] ABC = new int[3];
        int cont = 0;
        for (String s:str.split(" ")){
            ABC[cont] = Integer.parseInt(s);
            cont++;
        }
        if (ABC[0]==ABC[1] && ABC[1]==ABC[2]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}