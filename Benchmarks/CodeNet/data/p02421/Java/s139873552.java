import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taro = 0;
        int hanako = 0;

        for(int i = 0; i < n; i++){
            int ret = compareTo(sc.next(), sc.next());
            if(ret > 0) taro += 3;
            else if(ret < 0) hanako += 3;
            else {
                taro += 1;
                hanako += 1;
            }
        }

        System.out.println(String.format("%d %d", taro, hanako));
    }

    /**
     *
     * @param str1
     * @param str2
     * @return str1 > str2 -> 1, str1 == str2 -> 0, str1 < str2 -> -1
     */
    public static int compareTo(String str1, String str2){
        int length1 = str1.length();
        int length2 = str2.length();
        if(length1 > length2){
            for(int i = 0; i < length2; i++){
                if(str1.charAt(i) > str2.charAt(i)) return 1;
                else if(str1.charAt(i) < str2.charAt(i)) return -1;
            }
            return 1;
        }
        else if(length1 < length2){
            for(int i = 0; i < length1; i++){
                if(str1.charAt(i) > str2.charAt(i)) return 1;
                else if(str1.charAt(i) < str2.charAt(i)) return -1;
            }
            return -1;
        }
        else {
            for(int i = 0; i < length1; i++){
                if(str1.charAt(i) > str2.charAt(i)) return 1;
                else if(str1.charAt(i) < str2.charAt(i)) return -1;
            }
            return 0;
        }
    }
}

