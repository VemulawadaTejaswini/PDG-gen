import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int n = Integer.parseInt(line);
            int money = 100000;
            for(int i=0;i<n;i++){
            	money *= 1.05;
            	money = money % 1000 == 0 ? money : ((money / 1000) + 1) * 1000;
            }
            System.out.println(money);
    }
}