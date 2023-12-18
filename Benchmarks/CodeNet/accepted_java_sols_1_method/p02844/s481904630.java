import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[]  s = sc.next().toCharArray();
        int ct = 0;
        for (int i = 0; i < 11; i++) {
            char c1 = (char) ('0' + i);
            //探索
            for (int j = 0; j < n; j++) {
                if (s[j] == c1){//一致したら次の配列の文字を探す
                    for (int k = 0; k < 11; k++) {
                        char c2 = (char) ('0' + k);
                        for (int l = j+1; l < n; l++) {
                            if (s[l] == c2){
                                for (int m = 0; m < 11; m++) {
                                    char c3 = (char) ('0' + m);
                                    for (int o = l + 1; o < n; o++) {
                                        if (s[o] == c3){
                                            ct++;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(ct);
    }
}