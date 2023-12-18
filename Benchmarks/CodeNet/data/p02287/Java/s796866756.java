import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int h = sc.nextInt();
        int[] a = new int[h + 1];
 
        for(int i = 1; i <= h; i++) {
            a[i] = sc.nextInt();
        }
 
        for(int i = 1; i <= h; i++) {
            StringBuilder sb = new StringBuilder("node ").append(i).append(": key = ");
            sb.append(a[i]).append(", ");
            if(i >= 2) sb.append("parent key = ").append(a[i / 2]).append(", ");
            if(i * 2 <= h) sb.append("left key = ").append(a[i * 2]).append(", ");
            if(i * 2 + 1 <= h) sb.append("right key = ").append(a[i * 2 + 1]).append(", ");
            System.out.println(sb);
        }
        sc.close();
    }
}
