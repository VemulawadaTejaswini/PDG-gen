import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
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
        sc.close();
        int[] arr = new int[n];
        for(int i=0;i<in_data.length;i++){
            arr[in_data[i]-1] = i+1;
        }
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
}