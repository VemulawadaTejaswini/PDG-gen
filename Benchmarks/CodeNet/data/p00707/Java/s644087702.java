import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[71][71];
        String[][] str = new String[71][71];
        Arrays.fill(str[0], "");
        int w, h;
        String temp, max;
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0) break;

            for(int i=1; i<=h; i++){
                temp = sc.next();
                Arrays.fill(map[i], -1);
                Arrays.fill(str[i], "");
                for(int j=1; j<=w; j++){
                    if(temp.charAt(j-1)>='0' && temp.charAt(j-1)<='9'){
                        map[i][j] = temp.charAt(j-1) - '0';
                    }
                }
            }
            Arrays.fill(map[h+1], -1);
            Arrays.fill(str[h+1], "");

            max = "";
            for(int i=1; i<=h; i++){
                for(int j=1; j<=w; j++){
                    temp = "";
                    if(map[i][j]>=0){
                        if(str[i-1][j].length() < str[i][j-1].length()){
                            temp = str[i][j-1];
                        }else if(str[i-1][j].length()==str[i][j-1].length() && !str[i-1][j].equals(str[i][j-1])){
                            if(str[i-1][j].compareTo(str[i][j-1])>0){
                                temp = str[i-1][j];
                            }else{
                                temp = str[i][j-1];
                            }
                        }else{
                            temp = str[i-1][j];
                        }
                        if(!(temp.length()==0 && map[i][j]==0)){
                            str[i][j] = temp + String.valueOf(map[i][j]%10);
                        }

                        if(map[i+1][j]==-1 && map[i][j+1]==-1){
                            if(max.length() < str[i][j].length()){
                                max = str[i][j];
                            }else if(max.length()==str[i][j].length() && !max.equals(str[i][j])){
                                if(max.compareTo(str[i][j])<0){
                                    max = str[i][j];
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(max);
        }
    }
}