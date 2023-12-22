import java.nio.Buffer;
import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int h = Integer.parseInt(line[0]);
        int w = Integer.parseInt(line[1]);
        int[][] mx = new int[h][w];
        String[] rec;
        int count = 0;
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<h;i++){
            rec = sc.nextLine().split(" ");
            for(int j=0;j<w;j++){ 
                mx[i][j] = Integer.parseInt(rec[j]);
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(mx[i][j] % 2 == 1){
                    if(j+1 < w){
                        mx[i][j]--; 
                        mx[i][j+1]++;
                        ans.append((i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2) + ",");
                        count++;
                    }else if(i+1 < h){
                        mx[i][j]--; 
                        mx[i+1][j]++;
                        ans.append((i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1) + ",");
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        if(count > 0){
            String[] ansList = ans.toString().substring(0,ans.toString().length() - 1).split(",");
            for(int i=0;i<ansList.length;i++){
                System.out.println(ansList[i]);
            }
        }
	}
}