import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                sum++;
            }
        }

        System.out.println(sum);

    }
}