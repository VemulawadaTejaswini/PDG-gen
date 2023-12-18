import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, a, b;
        String temp, cmd;
        char[] str;
        char c;
        Scanner sc = new Scanner(System.in);
        temp = sc.next();
        n = sc.nextInt();
        str = new char[temp.length()];
        for(int i = 0; i < temp.length(); i++) 
            str[i] = temp.charAt(i);
        
        for (int i = 0; i < n; i++) {
            cmd = sc.next();
            a = sc.nextInt();
            b = sc.nextInt();
            switch (cmd) {
            case "print":
                for(int j = a; j <= b; j++) 
                    System.out.print(str[j]);
                System.out.println();
                break;
            case "reverse":
                c = str[a];
                str[b] = str[a];
                str[a] = c;
                break;
            case "replace":
                String tp = sc.next();
                int k = 0;
                for(int j = a; j <= b; j++) 
                    str[j] = tp.charAt(k++);
                break;
            }
        }
    }
}
