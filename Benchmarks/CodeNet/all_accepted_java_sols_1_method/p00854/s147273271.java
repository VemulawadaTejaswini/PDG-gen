import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        while (true){
            int n=s.nextInt();
            int k=s.nextInt();
            int m=s.nextInt();

            if(n==0 && k==0 && m==0) break;

            list.clear();
            for(int i=1;i<=n;i++){
                list.add(i);
            }
            int num = m-1;
            while (true){
                if(list.size()==1) break;
                list.remove(num);
                num+=k-1;
                if(num>=list.size()){
                    num= num%list.size();
                }
            }
            System.out.println(list.get(0));

        }
    }
}