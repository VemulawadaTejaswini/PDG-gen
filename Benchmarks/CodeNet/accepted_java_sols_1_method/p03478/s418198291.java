import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String line = null;
        int sum = 0;
        for(int i = 1; i < N+1; i++){
            int L = 0;
            line = String.valueOf(i);
            String []array = line.split("");
            for(int j = 0; j < array.length; j++){
                L += Integer.parseInt(array[j]);
            }
            if(L >= A && L <= B){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}