import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            
            //1行受け取り
            String line;
            try {
                line = sc.nextLine(); 
            }catch(Exception e) {
                break;
            }
            
            //数字の配列を作る
            int[] nums = new int[5];
            
            //lineを分割
            String[] linesp = line.split(",");
            
            
            //配列に数字を入れる
            for(int i = 0; i < 5; i++) {
                nums[i] = Integer.parseInt(linesp[i]);
            }
            
            //0~13の配列を用意してカウント数を入れる
            int[] count = new int[14];
            for(int i = 0; i < 5; i++) {
                count[nums[i]] += 1;
            }
            
            int paircount = 0;
            int straightcount = 0;
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < 14; i++) {
                if(count[i] > 1) {
                    list.add(count[i]);
                }
                if(count[i] == 2) {
                    paircount += 1;
                }
            }
            
            if(list.contains(4)) {
                System.out.println("four card");
            }else if(list.contains(3) && list.contains(2)) {
                System.out.println("full house");
            }else if(list.contains(3)) {
                 System.out.println("three card");
            }else if(paircount == 2) {
                System.out.println("two pair");
            }else if(paircount == 1) {
                System.out.println("one pair");
            }else {
                for(int i = 1; i < 11; i++) {
                    if(i < 10) {
                        if(count[i] == 1 && count[i+1] == 1 && count[i+2] == 1 && count[i+3] == 1 && count[i+4] == 1) {
                            System.out.println("straight");
                            break;
                        }
                    }else if(i == 10)   
                        if(count[i] == 1 && count[i+1] == 1 && count[i+2] == 1 && count[i+3] == 1 && count[1] == 1) {
                            System.out.println("straight");
                        }else {
                            System.out.println("null");
                        }
                }
            }
            
            
            

        }
    }
}

