import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        char[] target = stdIn.next().toCharArray();
        int cnt = 0;
        for(int i=0;i<n;i++){
            char[] board = stdIn.next().toCharArray();
            int interval = -1;
 
            char now = target[0];
            // 荳譁&#65533;ュ礼岼繝偵ャ繝域爾邏「
            Process:
                for(int k=0;k<board.length;k++){
                    char search = board[k];
                    // 荳閾エ縺励◆縺九&#65533;蛻、螳
                    if(now==search){
                        // 2譁&#65533;ュ礼岼縺ィ縺ョ髢馴囈隱ソ譟サ
                        for(int m=k+1;m<board.length;m++){
                            if(target[1]==board[m]){
                                interval = m-k;
                                // 縺ゅｋ髢馴囈縺ァtarget縺檎匳蝣エ縺励※繧九°
                                for(int p=2;p<target.length;p++){
                                    int next = m+interval;
                                    if(next>=board.length){
                                        break;
                                    }
                                    if(target[p]!=board[next]){
                                        break;
                                    }
                                    if(p+1==target.length){
                                        // 縺。繧&#65533;ｓ縺ィ逋サ蝣エ縺励※縺翫ｊbreak縺帙★蛻ー驕
                                        cnt++;
//                                      System.out.println("ok :"+String.valueOf(board));
                                        break Process;  // 莉・髯埼俣髫碑ェソ譟サ荳崎ヲ
                                    }
                                }
                            }
                        }
                    }
            }
        }
        System.out.println(cnt);
    }
}