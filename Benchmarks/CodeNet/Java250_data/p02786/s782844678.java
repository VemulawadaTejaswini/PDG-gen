import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long count = 0;

        while (H > 1) {
            H /= 2;
            count++;
        }
        // System.out.println("count: " + count);

        long node = 0;
        for (int i = 1; i <= count; i++) {
            node += Math.pow(2,i);
        }

        System.out.println(node+1);
    }
}