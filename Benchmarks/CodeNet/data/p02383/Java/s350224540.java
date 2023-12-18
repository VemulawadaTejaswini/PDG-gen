import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] d = new int[7];
        int dice=1, i=0, ans=0, surface=0, right=0, left=0, top=0, bottom=0;
        
        for(i=0;i<6;i++)d[i+1] = sc.nextInt();
        
        String h = sc. next();
        
        for(i=0;i<h.length();i++){
            switch (h.substring(i,i+1)) {
            case "E":
                surface = d[4];
                d[4] = d[6]; d[6] = d[3]; d[3] = d[1]; d[1] = surface;
                break;
                
            case "W":
                surface = d[3];
                d[3] = d[6]; d[6] = d[4]; d[4] = d[1]; d[1] = surface; 
                break;
                
            case "S":
                surface = d[5];
                d[5] = d[6]; d[6] = d[2]; d[2] = d[1]; d[1] = surface; 
                break;
                
            case "N":
                surface = d[2];
                d[2] = d[6]; d[6] = d[5]; d[5] = d[1]; d[1] = surface; 
                break;
                
            }
        }
        System.out.println(d[1]);
    }
}
