import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String s = Integer.toString(num);

        int counter = 0;

        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '1') ++counter;
        }

        System.out.println(counter);
    }
}