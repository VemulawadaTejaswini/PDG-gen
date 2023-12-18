import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        Boolean flag  = true;
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

        int a= in_data[0];
        int b = in_data[1];
        int ans = a - b*2;
        if(ans > 0 ){
            System.out.println(ans);
        }else{
            System.out.println(0);
        }
    }

}