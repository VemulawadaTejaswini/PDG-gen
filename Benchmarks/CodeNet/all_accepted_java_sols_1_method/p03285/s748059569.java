import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean flag = false;
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 16; j++){
                if(4 * i + 7 * j == N) flag = true;
            }
        }
        
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}