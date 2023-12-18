import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = Integer.parseInt(sn.next());
        int k = Integer.parseInt(sn.next());
        int cnt = 0;
        List<Integer> stateList = new ArrayList<Integer>();
        
        for ( int i = 0; i < n; i++){
            stateList.add(Integer.parseInt(sn.next()));
        }

        for ( int i2 = k-1; i2 < n-1; i2++){
            if (stateList.get(cnt) < stateList.get(i2+1)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            cnt = cnt+1;
        }
    }
}
