import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());
        String seq = "";
        for(int x = 0; x < n; x++){
            String check = scan.readLine();
            if(check.startsWith("insert")){
                seq = seq + check.substring(7) + " ";
            }
            else{
                if(seq.indexOf(check.substring(5)) != -1){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }
    }
}
