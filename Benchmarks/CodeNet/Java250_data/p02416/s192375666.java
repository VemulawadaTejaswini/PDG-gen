import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            char[] c = sc.nextLine().toCharArray();
            if(c[0] == '0') break;
            int sum = c[0] - '0';
            for(int i = 1,l = c.length;i < l;++i) sum += c[i] - '0';
            System.out.println(sum);
        }

    }

}