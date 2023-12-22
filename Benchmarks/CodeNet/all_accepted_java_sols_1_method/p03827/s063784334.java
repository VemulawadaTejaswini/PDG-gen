import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = sc.next();
        int max = 0;
        int curr = 0;
        for(int i = 0; i < n; i++){
            if(st.charAt(i) == 'D')
                curr -= 1;
            else
                curr += 1;
            if(curr > max)
                max = curr;
        }
        System.out.println(max);
    }
}