import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];
        int n = 0;
        String buf;
        while(!(buf = sc.next()).equals("-")){
            int m = sc.nextInt();
            for(int i = 0; i < m; i++){
                buf = shuffle(buf, sc.nextInt());
            }
            strings[n] = buf;
            n++;
        }
        for(int i = 0; i < n; i++){
            System.out.println(strings[i]);
        }
    }

    public static String shuffle(String str, int h){
        return new StringBuilder().append(str.substring(h)).append(str.substring(0, h)).toString();
    }
}

