import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x[];
        x = new int[26];

        while (scn.hasNext()){
            String str = scn.next();
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++){
                char chr = str.charAt(i);
                if((chr - 'a') >= 0 && (chr - 'a') < 26){
                    x[chr - 'a']++;
                }
            }
        }
        for(char moji = 'a'; moji <= 'z'; moji++){
            System.out.println(moji + " : " + x[moji - 'a']);
        }
    }
}
