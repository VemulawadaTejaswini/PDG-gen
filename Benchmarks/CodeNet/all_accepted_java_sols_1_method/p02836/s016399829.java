import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split("");
        int N = s.length;
        int count = 0;
        for(int i = 0; i < N / 2; i++) {
            if(s[i].equals(s[N - 1 - i])) {
                continue;
            }else {
                count++;
            }
        }
        
        System.out.println(count);
    }
}