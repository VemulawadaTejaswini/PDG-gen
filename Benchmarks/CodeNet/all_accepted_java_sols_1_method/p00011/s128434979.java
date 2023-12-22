import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[100];
        int[] b = new int[100];
        String c;
        int w = sc.nextInt();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            c = sc.next();
            String[] str = c.split(",");
            a[i] = Integer.parseInt(str[0]) -1;
            b[i] = Integer.parseInt(str[1]) -1;
        }
        int[] num = new int[w];
        for(int i=0; i< w; i++){
            num[i] = i+1;
        }
        
        int tmp;
        
        for(int i=0; i<n; i++){
            
            tmp = num[a[i]];
            num[a[i]] = num[b[i]];
            num[b[i]] = tmp;
        }

        for(int i=0; i<w; i++){
            System.out.println(num[i]);
        }

        sc.close();
    }
}
