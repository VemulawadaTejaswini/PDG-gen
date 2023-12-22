import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] result = new int[26];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        while(sc.hasNext()){
            String input = sc.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                String str = String.valueOf(ch);
                str = str.toLowerCase();
                ch = str.charAt(0);

                for (char c = 'a'; c <= 'z'; c++) {
                    int index = c-'a';

                    if(ch == c){
                        result[index]++;
                    }

                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            char alphabet = (char)(i+'a');
            System.out.println(alphabet + " : " + result[i]);
        }

        sc.close();
    }
}
