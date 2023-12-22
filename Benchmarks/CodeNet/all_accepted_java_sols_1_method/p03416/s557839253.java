import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = a;i <= b;i++){
            String str = String.valueOf(i);
            StringBuffer sb = new StringBuffer(str);
            String rev = sb.reverse().toString();
            if(str.equals(rev))
                count++;
        }
        System.out.println(count);
    }
}