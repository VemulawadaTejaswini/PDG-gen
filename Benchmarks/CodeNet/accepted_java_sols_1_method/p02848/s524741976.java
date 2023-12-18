import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[]text = new char[S.length()];
        for(int i=0;i<S.length();i++){
            text[i]=S.charAt(i);
        }
        for(int j=0;j<S.length();j++){
            for(int k=0;k<N;k++){
                if(text[j] =='Z'){
                    text[j]='A';
                }else {
                    text[j]++;
                }
            }
        }
        for (char s : text) {
            System.out.print(s);
        }
    }
}