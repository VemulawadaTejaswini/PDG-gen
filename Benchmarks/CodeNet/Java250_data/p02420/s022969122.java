import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        String str;
        while(true){
            str = sc.next();
            if(str.equals("-")){
                break;
            }
            String str1;
            String str2;
            int m;
            m = sc.nextInt();
            int h;
            for(i=0;i<m;i++){
                h = sc.nextInt();
                str1 = str.substring(0,h);
                str2 = str.substring(h);
                str = str2 + str1;
            }
            System.out.println(str);
        }
        sc.close();
    }
}
