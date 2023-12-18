import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        
        line = sc.nextLine();
        String[] lines = line.split(" ", 0);

        int[] nagasa = new int[num];
        for (int i = 0; i < num; i++) {
            nagasa[i] = Integer.parseInt(lines[i]);
        }
        
        if (num < 3) {
            System.out.println("0");
        }

        int count = 0;
        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (nagasa[i] != nagasa[j] && nagasa[i] != nagasa[k] && nagasa[j] != nagasa[k]) {
                        if (nagasa[i] + nagasa[j] > nagasa[k] && nagasa[i] + nagasa[k] > nagasa[j] && nagasa[k] + nagasa[j] > nagasa[i]) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}