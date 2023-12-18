import java.util.Scanner;
public class Main{
    public static int min(int a, int b, int c){
        if(a <= b && a <= c)
            return a;
        else if(b <= c)
            return b;
        else
            return c;
    }
    public static int distance(String s1, String s2){
        int data[][] = new int[s1.length()+1][s2.length()+1];
        for(int i = 0 ; i < s1.length()+1 ; i++)
            data[i][0] = i;
        for(int i = 0 ; i < s2.length()+1 ; i++)
            data[0][i] = i;
        for(int i = 1 ; i <= s1.length() ; i++){
            for(int j = 1 ; j <= s2.length() ; j++){
                int c = 1;
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    c--;
                data[i][j] = min(data[i-1][j-1]+c, data[i-1][j]+1, data[i][j-1]+1);
            }
        }
        return data[s1.length()][s2.length()];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(distance(s1,s2));
    }
}
