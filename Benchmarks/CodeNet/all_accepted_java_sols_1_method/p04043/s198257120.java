import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bunsetu = new int[3];
        for (int i = 0;i <= 2;i++)bunsetu[i] = sc.nextInt();
        Arrays.sort(bunsetu);
        if (bunsetu[0] == 5 && bunsetu[1] == 5 && bunsetu[2] == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
