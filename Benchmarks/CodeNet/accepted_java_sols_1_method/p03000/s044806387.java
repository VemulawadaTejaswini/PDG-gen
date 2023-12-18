import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] astr1 = str1.split(" ");
        int n = Integer.parseInt(astr1[0]);
        int x = Integer.parseInt(astr1[1]);

        String str2  = sc.nextLine();
        String[] astr2 = str2.split(" "); //状況に合わせて
        int[] in_data = Stream.of(astr2).mapToInt(y->{
            try{
                return Integer.parseInt(y);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();

        int[] bounds = new int[n+1];
        bounds[0] = 0;
        int count= 0;

        for(int i =1;i<=in_data.length;i++){
            bounds[i] = bounds[i-1] + in_data[i-1];
            }
        for(int j =0;j<bounds.length;j++){
            if(bounds[j]<= x){
                count+=1;
            }
        }

        System.out.println(count);
        }

    }
