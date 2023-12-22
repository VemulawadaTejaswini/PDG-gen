import java.util.Scanner;
class Main{
    public static void main(String[] a){
        Scanner stdin = new Scanner(System.in);
        int lt = stdin.nextInt();
        int[] line = new int[lt + 1];
        for(int i = 1; i <= lt; i++){
            line[i] = i;
        }
        int n = stdin.nextInt();
        for(int i = 0; i < n; i++){
            String str = stdin.next();
            String[] spl = str.split(",");
            int num1 = Integer.parseInt(spl[0]);
            int num2 = Integer.parseInt(spl[1]);
            int sum = line[num1];
            line[num1] = line[num2];
            line[num2] = sum;
        }
        for(int i = 1; i <= lt; i++){
            System.out.println(line[i]);
        }
    }
}
 