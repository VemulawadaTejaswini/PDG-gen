import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int red = 0;
        int blue = 0;
        for(int i=0;i<s.length;i++){
            if(s[i]=='0'){
                red++;
            }else{
                blue++;
            }
        }
        System.out.println(2*Math.min(red,blue));
        sc.close();
    }
    
}