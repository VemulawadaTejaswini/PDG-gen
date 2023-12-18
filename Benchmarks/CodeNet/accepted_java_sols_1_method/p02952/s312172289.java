import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digits  = String.valueOf(N).length();
        int count = 0;
        for (int i = 1; i<=digits; i++){
            if (i%2!=0){
                if(i==digits){
                    count = count + N-(int)Math.pow(10,digits-1)+1;
                }else {
                    count = count + (int) Math.pow(10, i - 1) * 9;
                }
            }
        }
        System.out.println(count);
    }
}
