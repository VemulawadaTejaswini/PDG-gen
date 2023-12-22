import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[] numArray = new int[10];
        String str = "No";
        Map<Integer,Integer> numMap = new HashMap<>();
        while(sc.hasNext()){
            int N = Integer.parseInt(sc.next());
            numArray[N]++;
        }
        for(int i=1;i<10;i++){
            if(numArray[i] == 2)str = "Yes";
        }
        System.out.println(str);
    }
}
