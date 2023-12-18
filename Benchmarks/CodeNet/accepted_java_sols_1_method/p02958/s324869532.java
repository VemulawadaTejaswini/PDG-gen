import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n  = sc.nextLine();
        String str = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        int flag  = 0;
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

        for(int i=1;i<=in_data.length;i++){
            if(in_data[i-1] != i){
                flag +=1;
                if(flag > 2){
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("YES");
    }
}