import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        int red = 0;
        int blue = 0;
        for (String s:str.split("")){
            if (s.equals("R")){
                red++;
            } else {
                blue++;
            }
        }
        if (red > blue){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}