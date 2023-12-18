import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int h = stdIn.nextInt();
        int w = stdIn.nextInt();
        int k = stdIn.nextInt();

        boolean[][] b = new boolean[h][w];
        String s;
        for(int i=0; i<h; i++){
            s = stdIn.next();
            char[] cs = s.toCharArray();
            for(int j=0; j<w; j++){
                if(cs[j] == '.'){
                    b[i][j] = false;
                }else{
                    b[i][j] = true;
                }
            }
        }

        boolean[] flag = new boolean[h+w+1];

        int ans = 0;
        while(!flag[h+w]){
            boolean[][] copy = new boolean[h][w];
            copy2DArray(b, copy);
            for(int i=0; i<flag.length-1; i++){
                if(flag[i]){
                    if(i < h){
                        for(int j=0; j<copy[0].length; j++){
                            copy[i][j] = false;
                        }
                    }else{
                        for(int j=0; j<copy.length; j++){
                            copy[j][i - h] = false;
                        }
                    }
                }
            }

            int counter = 0;
            for(int i=0; i<copy.length; i++){
                for(int j=0; j<copy[0].length; j++){
                    if(copy[i][j]){
                        counter++;
                    }
                }
            }
            if(counter == k){
                ans++;
            }
            
            changeFlag(flag, 0);
        }

        System.out.println(ans);
    }

    static void changeFlag(boolean[] flag, int idx){
        if(flag[idx]){
            flag[idx] = false;
            changeFlag(flag, idx+1);
            return;
        }else{
            flag[idx] = true;
            return;
        }
    }

    static void copy2DArray(boolean[][] from, boolean[][] to){
        for(int i=0; i<from.length; i++){
            for(int j=0; j<from[0].length; j++){
                to[i][j] = from[i][j];
            }
        }
    }
}
