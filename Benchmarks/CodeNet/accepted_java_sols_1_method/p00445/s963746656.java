import java.util.Scanner;

//JOI - Prelim   0522
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] s = sc.next().toCharArray();
            int[] c = { 0, 0 };
            for (int i = 0; i < s.length - 2; i++)
                if (s[i + 1] == 'O' && s[i + 2] == 'I')
                    for (int j = 0; j < 2; j++)
                        if (s[i] == 73 + j)
                            c[j]++;
            System.out.println(c[1] + "\n" + c[0]);
        }
    }
}
