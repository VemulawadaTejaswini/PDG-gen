import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int ridge = 4;  //棟
        int floor = 3;  //階
        int roomNumber = 10;    //部屋番号
        int[][][] liveHumans = new int[ridge][floor][roomNumber];
        
        //初期値設定
        for(int rid = 0; rid < ridge; rid++){
            for(int flo = 0; flo < floor; flo++){
                for(int roo = 0; roo < roomNumber; roo++){
                    liveHumans[rid][flo][roo] = 0;
                }
            }
        }
        
        //入力
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for(int i = 0; i < inputNum; i++){
            int inputRidge          = sc.nextInt();
            int inputFloor          = sc.nextInt();
            int inputRoomNumber     = sc.nextInt();
            int inputHuman          = sc.nextInt();
            if(liveHumans[inputRidge-1][inputFloor-1][inputRoomNumber-1] != 0){
                liveHumans[inputRidge-1][inputFloor-1][inputRoomNumber-1] += inputHuman;
                continue;
            }
            liveHumans[inputRidge-1][inputFloor-1][inputRoomNumber-1] = inputHuman;
        }
        
        /**
         * ネストしすぎて見にくいから改行
         */ 
        //出力
        for(int rid = 0; rid < ridge; rid++){
            
            for(int flo = 0; flo < floor; flo++){
                
                for(int roo = 0; roo < roomNumber; roo++){
                    System.out.print(" " + liveHumans[rid][flo][roo]);
                    if(roo == roomNumber-1){
                        System.out.println();
                    }
                }
                
                if(flo == floor-1 && (rid == 0 || rid == 1 || rid == 2)){
                    for(int floorCount = 0; floorCount < 20; floorCount++){
                        if(floorCount == 19){
                            System.out.println("#");
                            break;
                        }
                        System.out.print("#");
                    }
                }
            }
        
        }
    }
}

