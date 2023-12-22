import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        char[][] fields = new char[H][W];
        
        sc.nextLine();
        for(int i = 0; i < H; i++){
            fields[i] = sc.nextLine().toCharArray();
        }
        sc.close();

        Set<Integer> ignoreH = new HashSet<>();
        Set<Integer> ignoreW = new HashSet<>();        
        
        for(int i = 0; i < H; i++){
            boolean delH = true;
            for(int j = 0; j < W; j++){
                if (fields[i][j] != '.'){
                    delH = false;
                    break;
                }
            }
            
            if(delH) ignoreH.add(i);
        }
        
        for(int j = 0; j < W; j++){
            boolean delW = true;            
            for(int i = 0; i < H; i++){
                if(fields[i][j] != '.'){
                    delW = false;
                    break;
                }
            }
            if(delW) ignoreW.add(j);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < H; i++){
            if( ignoreH.contains(i) ) continue;
            for(int j = 0; j < W; j++){
                if( ignoreW.contains(j) ) continue;
                sb.append(fields[i][j]);
            }
            sb.append("\r\n");
        }
        
        System.out.println(sb.toString());
    }
}
