import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=sc.next();
        char[] count=new char[26];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)-'a']++;
        }
        int steps=0;
        for(int i=0;i<T.length();i++){
            if(count[T.charAt(i)-'a']==0){
                steps++;
            }
            else{
                count[T.charAt(i)-'a']--;
            }
        }
        System.out.println(steps);
    }
}
