import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> numList = new ArrayList<String>();
        while(sc.hasNext()){
            String x = sc.next();
            if(x.equals("0")){
                break;
            }
            numList.add(x);
        }
        for(int i = 0; i < numList.size(); i++){
            String str = numList.get(i);
            int sum = 0;
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                int n = Character.getNumericValue(c);
                sum += n;
            }
            System.out.println(sum);
        }
    }
}
