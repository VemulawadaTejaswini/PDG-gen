    import java.util.*;
    
    public class Main{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int h = scan.nextInt();
            int w = scan.nextInt();
            String[] readS = new String[h];
            for(int i = 0; i < h; i++) readS[i] = scan.next();
            char[][] s = new char[h][w];
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++) s[i][j] = readS[i].charAt(j);
            }
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(s[i][j] == '#'){
                        try{
                        if(s[i - 1][j] != '#' && s[i][j + 1] != '#' && s[i + 1][j] != '#' && s[i][j - 1] != '#'){
                            System.out.println("No");
                            return;
                        }
                        }catch(Exception e){
                            
                        }
                    }
                }
            }
            System.out.println("Yes");
            scan.close();
        }
    }