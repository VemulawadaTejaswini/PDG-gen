import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Integer> numbers = new HashSet<Integer>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int n,x,sum=0,result =0;
        n = in.nextInt();
        in.nextLine();

        for(int i = 0 ;i<n;i++){
            x=in.nextInt();
            sum+=x;
            numbers.add(x);
            myNumbers.add(x);
        }
        if(numbers.size() == 1){
            System.out.println(0);
        }else{
            double mean = Math.round((double) sum/(double) n);
            int meanResult = (int) mean;
            for(int i=0;i<n ;i++){
                if(myNumbers.get(i) != meanResult){
                    int y = myNumbers.get(i) - meanResult;
                    result += (y*y);

                }
            }
            System.out.println(result);
        }

    }
}
