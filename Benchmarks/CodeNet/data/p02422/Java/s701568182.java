import java.util.Scanner;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        String str = scanner.next();
        String order,change;
        int Q = scanner.nextInt();
        int a,b;
 
        for(int loop = 0; loop < Q; loop++){
            order = scanner.next();
 
            if(order.equals("print")){
 
                a = scanner.nextInt();
                b = scanner.nextInt();
 
                print(str,a,b);
 
            }else if(order.equals("reverse")){
 
                a = scanner.nextInt();
                b = scanner.nextInt();
 
                str = reverse(str,a,b);
 
            }else{
 
                a = scanner.nextInt();
                b = scanner.nextInt();
                change = scanner.next();
 
                str = replaceStr(str,a,b,change);
            }
        }
    }
 
    private static void print(String str,int a,int b){
        String output = str.substring(a, b+1);
        System.out.println(output);
    }
 
    private static String reverse(String str,int a,int b){
 
        char work[] = str.toCharArray();
 
        int num = b-a+1;
        char tmp;
 
        for(int i = 0; i < num/2; i++){
 
            tmp = work[a+i];
            work[a+i] = work[b-i];
            work[b-i] = tmp;
        }
 
        return String.valueOf(work).substring(0, str.length());
    }
 
    private static String replaceStr(String str,int a,int b,String change){
 
        char ch[] = change.toCharArray();
        char work[] = str.toCharArray();
 
        for(int i = a; i <= b; i++){
            work[i] = ch[i-a];
        }
 
        return String.valueOf(work).substring(0,str.length());
    }
}
