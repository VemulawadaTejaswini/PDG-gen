import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            StringBuilder sb = new StringBuilder();

            if( h == 0 && w == 0)break;
            for(int i=0; i<h; i++){
                if(i==0 || i==h-1){
                    for(int k=0; k<w; k++){
                        sb.append("#");
                    }
                    sb.append("\n");
                }else{
                    for(int k=0; k<w; k++){
                        if(k==0 || k==w-1){
                            sb.append("#");
                        }else{
                            sb.append(".");
                        }
                    }
                    sb.append("\n");
                }
            }
            System.out.println(sb);
        }

    }
}