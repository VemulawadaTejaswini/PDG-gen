import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] count = new int[26];
        char c;
        String str1, str2, temp = "";
        for (int i = 0; i < 26; i++) 
            count[i] = 0;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();

        for(int i = 0; i < str1.length(); i++) {
            temp += str1.charAt(i % str1.length());
            if (temp.equals(str2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
