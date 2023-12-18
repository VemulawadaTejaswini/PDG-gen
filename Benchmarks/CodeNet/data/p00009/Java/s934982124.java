import java.io.*;
import java.util.*;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
                int n=Integer.parseInt(br.readLine());
                int count=0;
                boolean[] map=new boolean[n];
                Arrays.fill(map, true);
                map[0]=false;
                for(int i=2;i*i<n;i++){
                    if(map[i-1]){
                        for(int j=2;j*i<=n;j++){
                            map[i*j-1]=false;
                        }
                    }
                }for(int i=0;i<map.length;i++){
                    if(map[i]) count++;
                }System.out.println(count);
            }catch(Exception e){System.exit(0);}
        }
    }
    
}