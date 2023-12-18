import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String input = a.readLine();
        int x = Integer.parseInt(input);
        if(x==3 || x==5 || x==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}