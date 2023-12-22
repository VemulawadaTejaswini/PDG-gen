import java.util.Scanner;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> sum =  new ArrayList<>();
        sum.add(scan.nextInt());
        for(int i=1;i<n;i++){
            sum.add(sum.get(i-1)+scan.nextInt());
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
                min = Math.min(min,Math.abs(sum.get(j)-(sum.get(n-1)-sum.get(j))));
        }
        System.out.println(min);
    }
}