import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, a, b, k;
        String temp, cmd;
        char[] str, stack;
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
                k = 0;
                stack = new char[b - a + 1];
                for(int j = a; j <= b; j++) 
                    stack[k++] = str[j];
                for(int j = a; j <= b; j++) 
                    str[j] = stack[--k];
                break;
            case "replace":
                String tp = sc.next();
                k = 0;
                for(int j = a; j <= b; j++) 
                    str[j] = tp.charAt(k++);
                break;
            }
        }
    }
}
