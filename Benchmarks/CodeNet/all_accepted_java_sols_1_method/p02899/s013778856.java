import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] notes = sc.nextLine().split(" ");
        sc.close();

        int[] junban = new int[N];
        for (int i = 0; i < notes.length; i++) {
            int studentNo = i + 1;
            int peopleCnt = Integer.parseInt(notes[i]);
            junban[peopleCnt - 1] = studentNo;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : junban) {
            sb.append(i + " ");
        }

        sb.setLength(sb.length() - 1);

        System.out.println(sb.toString());
    }

}
