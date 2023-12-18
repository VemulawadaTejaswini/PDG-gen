import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chcnt[] = new int[26];
        String str = "";
        while(sc.hasNext()){
            str = sc.nextLine();
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++ ){
                char ch = str.charAt(i);
                if(ch <= 'z' && ch >= 'a') chcnt[ch - 'a']++;
            }
        }
        for(int i = 0; i < chcnt.length; i++){
            System.out.println((char)('a' + i) + " : " + chcnt[i]);
        }
    }
}