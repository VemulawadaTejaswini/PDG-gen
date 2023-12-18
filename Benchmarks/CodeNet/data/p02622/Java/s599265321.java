import java.util.Scanner;

//クラス名は必ずMainにする必要があります。



public class Main {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] s_c = s.toCharArray();
        char[] t_c = t.toCharArray();
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            if(s_c[i] != t_c[i]){
                num++;
            }
        }
        System.out.println(num);
 	}
}