import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int[] n;
    public static int m;
    public static String s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count=new int[128];
        while(sc.hasNext()){
            s=sc.nextLine().toLowerCase();
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)]++;
            }
        }
        for(char c='a'; c<='z' ;c++){
            System.out.println(c+" : "+count[c]);
        }
    }
}

