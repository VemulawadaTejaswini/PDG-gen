import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] s=sc.next().toCharArray();
            for(int i=0;i<s.length;i++) {
                if(s[i]=='@') {
                    for(int j=0;j<s[i+1]-'0';j++) {
                        System.out.print(s[i+2]);
                    }
                    i+=2;
                    continue;
                }
                System.out.print(s[i]);
            }
            System.out.println();
        }
    }
}
