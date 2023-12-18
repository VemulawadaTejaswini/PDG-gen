import java.io.*;
import java.util.*;

class Main{
    int[] all_num = new int[10000];
    final static int max = 1000000;
    int devise(int num){
        int index = 0;
        for(int i = 0;i < 1417;i++){
            if(all_num[i] >= num){
                index = i - 1;
            }
        }
        return index;
    }
    void doteki(){
        for(int i = 0; i < 10000;i++){
            all_num[i] = ((i+1)*(i+2)*(i+3))/6;
            if(all_num[i] < max){
                //System.out.println(all_num[i]);
            }
            else
                break;
        }
    }
    boolean kisuu(int num){
        if(num % 2 == 1){
            return true;
        }
        return false;
    }
    void run() throws IOException{
        //System.out.println(num);
        doteki();
        int num;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            num = Integer.parseInt(in.readLine());
            int index = 0;
            int count = 0;
            int ans = 0;
            int ans_count = 32766;
            if(num == 0){
                break;
            }
            index = devise(num);
            for(int i = index;i > -1;i--){
                ans = 0;
                for(int j = i;j > -1;){
                    if(ans + all_num[j] > num){
                        j--;
                    }
                    else if(ans + all_num[j] < num){
                        ans += all_num[j];
                        count++;
                    }
                    else if(ans + all_num[j] == num){
                        count++;
                        if(ans_count >= count){
                            ans_count = count;
                            count = 0;
                        }
                        break;
                    }
                }
            }
            System.out.print(ans_count);
            //?\???°??¨
            count = 0;
            ans = 0;
            ans_count = 32766;
            for(int i = index;i > -1;i--){
                ans = 0;
                for(int j = i;j > -1;){
                    if(kisuu(all_num[j]) == true){
                        if(ans + all_num[j] > num){
                            j--;
                        }
                        else if(ans + all_num[j] < num){
                            ans += all_num[j];
                            count++;
                        }
                        else if(ans + all_num[j] == num){
                            count++;
                            if(ans_count >= count){
                                ans_count = count;
                                count = 0;
                            }
                            break;
                        }
                    }
                    else{
                        j--;
                    }
                }
            }
            System.out.print(" "+ans_count);
            System.out.println();

        }



    }
    public static void main(String[] args) throws IOException{
        Main ma = new Main();
        ma.run();
    }
}