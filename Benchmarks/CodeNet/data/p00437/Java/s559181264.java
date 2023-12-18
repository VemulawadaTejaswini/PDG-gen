import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        while(true){

            
            //各個数入力
            String input = scan.nextLine();
            
            //空白区切り
            String[] each_num = input.split(" ");
            
            
            //Int型へ変更
            int power = Integer.parseInt(each_num[0]);
            int motor = Integer.parseInt(each_num[1]);
            int cable = Integer.parseInt(each_num[2]);
            
        
            
            //終了時判定
            if ((power == 0)&&(motor == 0)&&(cable == 0)){
                break;
            }
            
            
            //テスト回数入力。その後Int型へ変換
            String input_count = scan.nextLine();
            int count = Integer.parseInt(input_count);
            

            //二次元リストを宣言
            ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
            
            //各テスト結果をリストに追加。
            for (int i=0;i<count;i++){
                String input_data = scan.nextLine();
                String[] each_data = input_data.split(" ");
                ArrayList<Integer> contents = new ArrayList<Integer>();
                contents.add(Integer.parseInt(each_data[0]));
                contents.add(Integer.parseInt(each_data[1]));
                contents.add(Integer.parseInt(each_data[2]));
                contents.add(Integer.parseInt(each_data[3]));
                data.add(contents);
            }
            
            //各部品の故障状況の配列を作成。
            int flag[] = new int[power+motor+cable+1];
            //初めは、故障か判断不可な2を格納
            for (int i=1; i<power+motor+cable+1 ; i++){
                 flag[i] = 2;
            }
            
            
            for (int i=0; i<count; i++){
                
                //テスト結果が正常な場合、その時の部品全て正常な状況を示す1をflag[]に格納する
                if(data.get(i).get(3) == 1) {
                    for(int j=0; j < 3; j++){
                        flag[data.get(i).get(j)] = 1;
                    }
                }
            }
            
            
            //故障の部品探し。テスト不可の際に、使用部品のうち、２つ正常な部品を使っている場合、残りの一つが故障と断定。
            int counter = 0;
            for (int i=0; i< count; i++){
                counter = 0;
                for (int j = 0; j<3; j++){
                    if (flag[data.get(i).get(j)] == 1){
                        counter ++;
                        
                    }
                }
                if(counter == 2){
                    for (int j = 0; j<3; j++){
                        if (flag[data.get(i).get(j)] != 1){
                            flag[data.get(i).get(j)] = 0;
                        }
                    }
                    
                }
            }
            //出力部分
            for (int i=1; i<power+motor+cable+1 ; i++){
                 System.out.println(flag[i]);
            }
        }
    }
}

