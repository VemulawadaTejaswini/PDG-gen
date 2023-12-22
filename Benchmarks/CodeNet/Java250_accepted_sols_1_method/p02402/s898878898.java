import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] Args){
        final int n = Integer.parseInt(sc.next());
        long sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            final int a = Integer.parseInt(sc.next());
            max = Math.max(max, a);
            min = Math.min(min, a);
            sum += a;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}