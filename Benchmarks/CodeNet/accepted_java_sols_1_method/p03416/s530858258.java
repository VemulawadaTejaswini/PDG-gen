import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        int count = 0;
        for (int i = A; i <= B; i++){
            String start = String.valueOf(i);
            char[] a = start.toCharArray();
            String reverceA = "";
            for (int j = start.length(); j != 0; j--) {
                reverceA += a[j - 1];
            }

            if(start.equals(reverceA)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
