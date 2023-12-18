import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int ans = 0;
        int cont = 0;
        for (String s:str.split("")){
            if (s.equals("A") || s.equals("C") || s.equals("G") || s.equals("T")){
                cont++;
                if (cont>ans){
                    ans = cont;
                }
            } else {
                cont = 0;
            }
        }
        System.out.println(ans);
    }
}