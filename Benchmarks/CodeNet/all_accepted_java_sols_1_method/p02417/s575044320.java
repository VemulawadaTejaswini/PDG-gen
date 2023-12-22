import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "";
        while(sc.hasNextLine()){
            x += sc.nextLine().toLowerCase();
        }

        sc.close();

        char y;
        char z ='a';
        int n[] = new int[26];
        for(int i = 0; i < x.length(); i++){
            y = x.charAt(i);
            for(int j = 0; j < 26; j++){
                if(z + j == y){
                    n[j] += 1;
                }
            }
        }

        for(int k = 0; k < 26; k++){
            System.out.printf("%c : %d\n", (char)(z + k), n[k]);
        }
    }
}
