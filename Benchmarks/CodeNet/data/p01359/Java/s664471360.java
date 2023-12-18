import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input;

        int n, q;
        int[] years;
        String[] eraNames;
        String ans;
        int year;
        int idx;

        while (true) {
            input = sc.nextLine().trim().split(" ");
            n = Integer.parseInt(input[0]);
            q = Integer.parseInt(input[1]);

            years = new int[2*n];
            eraNames = new String[n];

            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                input = sc.nextLine().trim().split(" ");
                eraNames[i] = input[0];
                years[2*i+1] = Integer.parseInt(input[2]);
                years[2*i] = years[2*i+1] - Integer.parseInt(input[1]) + 1;
            }

            for (int i = 0; i < q; i++) {
                ans = "";
                year = Integer.parseInt(sc.nextLine().trim());
                idx = searchIndex(year, years);
                if (idx % 2 == 0)
                    ans += "Unknown";
                else
                    ans += eraNames[idx/2] + " " + (year - years[idx-1] + 1);

                System.out.println(ans);
            }
        }
    }

    private static int searchIndex(int year, int[] years) {
        int idx = 0;
        int head = 0;
        int tail = years.length - 1;
        while (head <= tail) {
            idx = (head + tail) / 2;
            if (idx % 2 == 0) {
                if (idx == 0 && year < years[0])
                    return 0;
                if (years[idx] <= year && year <= years[idx+1])
                    return idx + 1;
                if (year < years[idx] && years[idx-1] < year)
                    return idx;
                if (idx != 0 && year <= years[idx-1]) {
                    tail = idx - 1;
                } else if (years[idx+1] < year) {
                    head = idx + 1;
                }
            } else {
                if (idx == years.length-1 && years[idx] < year)
                    return years.length;
                if (years[idx-1] <= year && year <= years[idx])
                    return idx;
                if (year < years[idx+1] && years[idx] < year)
                    return idx + 1;
                if (year < years[idx-1]) {
                    tail = idx - 1;
                } else if (idx != years.length-1 && years[idx+1] <= year) {
                    head = idx + 1;
                }
            }
        }
        return idx;
    }
}