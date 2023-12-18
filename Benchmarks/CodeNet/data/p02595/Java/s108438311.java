import java.util.Scanner;

public class atcoder {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        for(int i=0;i<a;i++){
               int c=sc.nextInt();
               int d=sc.nextInt();
               double e=Math.sqrt(Math.pow(c,2)+Math.pow(d,2));
               if(b>=e){
                   temp++;
               }
        }
        System.out.println(temp);
    }
}
