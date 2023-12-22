import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            int t = 0;
            int x = 0;
            int y = 0;
            
            for(int i=0; i<N; i++){
                String strSplit[] = br.readLine().split(" ");
                int ti = Integer.parseInt(strSplit[0]);
                int xi = Integer.parseInt(strSplit[1]);
                int yi = Integer.parseInt(strSplit[2]);
                
                int dt = ti - t;
                int dx = xi - x;
                int dy = yi - y;
                int dxdy = dx + dy;
                
                if(dxdy < 0){
                    dxdy = dxdy % 2 * (-1);
                }
                
                t = ti;
                x = xi;
                y = yi;
                
                if((Math.abs(dx) + Math.abs(dy)) <= dt && dxdy%2 == dt%2){
                    
                }else{
                    System.out.println("No");
                    return;
                }
            }
            
            System.out.println("Yes");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}