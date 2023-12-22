import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();
        int[] aa=new int[3];
        aa[0]=a;
        aa[1]=b;
        aa[2]=c;
        Arrays.sort(aa);
        if(aa[0]==aa[1]&&aa[2]>aa[0]){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
