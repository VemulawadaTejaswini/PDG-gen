import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int i;
        int num[] = new int[w];
        for(i=0;i<w;i++){
            num[i] = i+1;
        }
        for(i=0;i<n;i++){
            String str = sc.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int r = num[a-1];
            num[a-1] = num[b-1];
            num[b-1] = r;
        }
        for(i=0;i<w;i++){
            System.out.println(num[i]);
        }
    }
}

