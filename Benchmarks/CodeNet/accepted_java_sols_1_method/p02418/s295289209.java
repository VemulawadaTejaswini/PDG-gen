import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] count = new int[26];
        char c;
        String str1, str2, temp;
        for (int i = 0; i < 26; i++) 
            count[i] = 0;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();

        for(int i = 0; i < str1.length(); i++) {
            temp = "";
            for (int j = 0; j < str2.length(); j++) 
                temp += str1.charAt((i+j) % str1.length());
            if (temp.equals(str2)) {
                System.out.println("Yes");
                break;
            } 
            if (i == str1.length() - 1)
                System.out.println("No");
        }
    }
}
