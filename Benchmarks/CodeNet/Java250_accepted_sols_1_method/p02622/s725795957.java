import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        char[] sChar = new char[s.length()];
        char[] tChar = new char[t.length()];

        for(int i = 0; i<s.length(); i++){
            sChar[i] = s.charAt(i);
            tChar[i] = t.charAt(i);
        }

        int count = 0;
        for(int j = 0; j<s.length(); j++){
            if(sChar[j] != tChar[j]){
                count++;
            }
        }
        System.out.println(count);

    }
}