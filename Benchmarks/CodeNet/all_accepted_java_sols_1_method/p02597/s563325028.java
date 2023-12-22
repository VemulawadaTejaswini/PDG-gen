import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String c[] = sc.next().split("");

        int right = c.length-1;
        int left = 0;

        int count = 0;

        while (left < right) {
            if (c[left].equals("R")) {
                left++;
            }
            if (c[right].equals("W")) {
                right--;
            }

            if (left >= right) {
                break;
            }
            if (c[left].equals("W") && c[right].equals("R")) {
                String s = c[left];
                c[left] = c[right];
                c[right] = s;
                count++;
            }
        }

        System.out.println(count);
    }
}
