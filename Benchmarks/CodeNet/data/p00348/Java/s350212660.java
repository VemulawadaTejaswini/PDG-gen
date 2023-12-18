import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            int row = 0;
            while((line = br.readLine()) != null) {
            	String[] list = line.split(" ",0);
                    // ????´?????????°???????????????
                    if(list.length == 1) {
                        row = Integer.valueOf(line);
                } else {
                    // ????´??????????????????§???????????????????????°????????????
                        int cnt = processLine(row, list);
                        System.out.println(cnt);        
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // line???List????????????cntSort???List????????????cnt?????????
    private static int processLine(int row, String[] list) {
            List<Integer> numList = new ArrayList<>();
            for(int i = 0; i < row; i++) {
                int num = Integer.valueOf(list[i]);
                numList.add(num);
            }
            int cnt = cntSort(numList);
            return cnt;
    }
    
    private static int cntSort(List<Integer> numList) {
            int cnt = 0;
            for(int i = 0; i < numList.size(); i++) {
                int firstNum = numList.get(i);
                int secondNum = numList.get(i + 1);
                if(firstNum < secondNum) {
                    numList.remove(i);
                    numList.add(firstNum);
                    cnt++;
                }
            }
            return cnt;
    }
}