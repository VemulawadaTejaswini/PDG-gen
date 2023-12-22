import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int VerticalLineNum = Integer.parseInt(br.readLine());
        int HorizontalLineNum = Integer.parseInt(br.readLine());
        int[][] HorizontalLine = new int[HorizontalLineNum][2];
        
        for(int i = 0; i < HorizontalLine.length; i++){
            String[] FromTo = br.readLine().split(",");
            HorizontalLine[i][0] = Integer.parseInt(FromTo[0]);
            HorizontalLine[i][1] = Integer.parseInt(FromTo[1]);
        }
        
        int[] ResultLineNum = new int[VerticalLineNum + 1];
        for(int i = 1; i < VerticalLineNum + 1; i++){
            int CurrentLineNum = i;
            for(int hl = 0; hl < HorizontalLine.length; hl++){
                if(CurrentLineNum == HorizontalLine[hl][0]){
                    CurrentLineNum = HorizontalLine[hl][1];
                }
                else if(CurrentLineNum == HorizontalLine[hl][1]){
                    CurrentLineNum = HorizontalLine[hl][0];
                }
            }
            ResultLineNum[CurrentLineNum] = i;
        }
        
        for(int i = 1; i < ResultLineNum.length; i++){
            System.out.println(ResultLineNum[i]);
        }
    }
}