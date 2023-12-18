import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[26];

        for(int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        StringBuilder sb = new StringBuilder();

        while(sc.hasNext()) {
            sb.append(sc.nextLine().toLowerCase());
        }

        String line = sb.toString();

        for(int i = 0; i < line.length(); i++) {
            for(int j = 0; j < 26; j++) {
                if(line.charAt(i) == 'a' + j) {
                    array[j]++;
                }
            }
        }

        for(int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i) + " : " + array[i]);
        }
    }
}

