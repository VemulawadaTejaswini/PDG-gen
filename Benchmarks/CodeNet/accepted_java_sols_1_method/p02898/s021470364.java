import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        int[] in_data = Stream.of(astr).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();

        int n = in_data[0];
        int k = in_data[1];
        int hito =0;
        String str2  = sc.nextLine();
        String[] astr2 = str2.split(" "); //状況に合わせて
        int[] in_data2 = Stream.of(astr2).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();


        for(int i=0;i<in_data2.length;i++){
            if(in_data2[i]>=k){
                hito+=1;
            }
        }
        System.out.println(hito);
    }
}