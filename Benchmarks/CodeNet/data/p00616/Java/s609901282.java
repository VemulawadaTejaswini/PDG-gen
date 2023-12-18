import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            /* input */
            while(true){
                line = br.readLine();
                int n = Integer.parseInt(line.split(" ")[0]), h = Integer.parseInt(line.split(" ")[1]);
                if(n==0&&h==0) return;
                
                boolean[][][] c = new boolean [n][n][n];
                
                int ans = n*n*n;
                
                for(int i=0;i<h;i++){
                	line = br.readLine();
                	
                	String[] str = line.split(" ");
                	String p = str[0];
                	int a = Integer.parseInt(str[1])-1, b = Integer.parseInt(str[2])-1;
                	if(p.equals("xy")){
                		for(int j=0;j<n;j++){
                			if(!c[a][b][j]){
                				c[a][b][j] = true;
                				ans--;
                			}
                		}
                	} else if(p.equals("yz")){
                		for(int j=0;j<n;j++){
                			if(!c[j][a][b]){
                				c[j][a][b] = true;
                				ans--;
                			}
                		}
                	} else {
                		for(int j=0;j<n;j++){
                			if(!c[a][j][b]){
                				c[a][j][b] = true;
                				ans--;
                			}
                		}
                	}
                    System.gc();
                }
                System.out.println(ans);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}