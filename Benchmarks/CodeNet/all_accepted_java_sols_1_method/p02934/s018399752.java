import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String suuji = sc.nextLine();
        String[] astr = suuji.split(" "); //状況に合わせて
        Double tmp = 0.0;
        double ans = 0.0;
        Double hoge = 0.0;
        int[] in_data = Stream.of(astr).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();

        for(int i=0;i<in_data.length;i++){
            hoge = (double)1 / in_data[i];
            tmp = tmp + hoge;
        }
        ans = 1/tmp;

        if(ans == (int) ans){
            System.out.println((int)ans);
        }else{
            System.out.println(ans);
        }
    }
}