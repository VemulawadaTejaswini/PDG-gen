import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,tmp;
        int j,strnum;
        str = sc.next();
        while(!str.equals("-")){
            int m = sc.nextInt();
            for(int i=0;i<m;i++){
                int h = sc.nextInt();
                tmp = str.substring(h);
                strnum = str.length();
                str = tmp + str;
                str = str.substring(0,strnum);
            }
            System.out.println(str);
            str = sc.next();
        }
    }
}
