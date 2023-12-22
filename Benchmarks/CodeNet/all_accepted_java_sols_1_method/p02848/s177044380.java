import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    char[] s = sc.next().toCharArray();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length;i++){
        int count = (s[i]-'A'+n)%26;
        sb.append((char)('A'+count));
    }

    System.out.println(sb.toString());
    sc.close();
}
}
    