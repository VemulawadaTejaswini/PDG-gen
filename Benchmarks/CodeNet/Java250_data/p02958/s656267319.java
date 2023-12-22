
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> ary = new ArrayList<>();
        for (int i=0; i<N; i++){
            ary.add(scanner.nextInt());
        }
        int cnt = 0;
        for(int idx=0; idx<N; idx++){
            if(idx+1!=ary.get(idx)){
                cnt++;
            }
        }
        if(cnt==0|cnt==2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}