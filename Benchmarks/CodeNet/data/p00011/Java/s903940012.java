import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int[] num = new int[w];
        for(int i=0;i<w;i++) num[i] = i + 1;
        int n = sc.nextInt(),a,b,tmp;
        String tmpstr;
        for(int i=0;i<n;i++){
            tmpstr = sc.next();
            String[] str = tmpstr.split(",");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            tmp = num[a-1];
            num[a-1] = num[b-1];
            num[b-1] = tmp;
        }
        for(int i=0;i<w;i++) System.out.println(num[i]);
    }
}
