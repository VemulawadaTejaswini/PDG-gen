import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] AlphaBowl = new int[26];
        for(int i = 0; i < 26; i++){
            AlphaBowl[i] = 0;
        }
        while(sc.hasNext()){
            String str = sc.next();
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++){
                char alpha = 'a';
                for(int j = 0; j <= ('z' - 'a'); j++){
                    if(str.charAt(i) == alpha){
                        AlphaBowl[j]++;
                        break;
                    }
                    alpha++;
                }
            }
        }
        char alpha = 'a';
        for(int i = 0; i <= ('z' - 'a'); i++){
            System.out.println(alpha + " : " + AlphaBowl[i]);
            alpha++;
        }
        sc.close();
    }
}
