import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String[] line = br.readLine().split(" ");
            int m = Integer.parseInt(line[0]);
            int f = Integer.parseInt(line[1]);
            int r = Integer.parseInt(line[2]);

            if(m == -1 && f == -1 && r == -1){
                break;
            }else if(m == -1 || f == -1){
                sb.append("F").append("\n");
            }else if(m + f >= 80){
                sb.append("A").append("\n");
            }else if(m + f >= 65){
                sb.append("B").append("\n");
            }else if(m + f >= 50){
                sb.append("C").append("\n");
            }else if(m + f >= 30){
                if(r >= 50){
                    sb.append("C").append("\n");
                }else{
                    sb.append("D").append("\n");
                }
            }else{
                sb.append("F").append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}