import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
class Salesman {
    private long sales;
    boolean isAchieved;
 
    Salesman(long price, long goodsnum){
        this.sales += price * goodsnum;
        this.isAchieved = this.sales >= 1000000;
    }
    void addSales(long price, long number) {
        this.sales += price * number;
        this.isAchieved = this.sales >= 1000000;
    }
}
 
public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            while (true) {
                String line;
                long price,goodsnum;
                int num;
                int n = Integer.parseInt(br.readLine());
                if(n ==0){
                    break;
                }
                LinkedHashMap<Integer, Salesman> list = new LinkedHashMap<>();
 
                for (int i = 0; i < n; i++) {
                    line = br.readLine();
                    st = new StringTokenizer(line);
                    num = Integer.parseInt(st.nextToken());
                    price = Long.parseLong(st.nextToken());
                    goodsnum= Long.parseLong(st.nextToken());
                    if(list.containsKey(num)){
                        list.get(num).addSales(price,goodsnum);
                    }else{
                        list.put(num,new Salesman(price,goodsnum));
                    }
                }
 
                boolean isExist = false;
                for (Map.Entry<Integer, Salesman> entry : list.entrySet()) {
                    if(entry.getValue().isAchieved){
                        System.out.println(entry.getKey());
                        isExist = true;
                    }
                }
                if (!isExist){
                    System.out.println("NA");
                }
            }
 
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
}