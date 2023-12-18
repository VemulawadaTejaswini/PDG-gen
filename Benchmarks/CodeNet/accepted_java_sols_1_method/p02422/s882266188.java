import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer strBuf = new StringBuffer(str);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            String order = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt()+1;
            if(order.equals("replace")){
                String repStr = sc.next();
                strBuf = strBuf.replace(x,y,repStr);
            }else if(order.equals("reverse")){
                StringBuffer revBuf = new StringBuffer(strBuf.substring(x,y));
                String revStr = revBuf.reverse().toString();
                strBuf = strBuf.replace(x,y,revStr);
            }else{
                System.out.println(strBuf.substring(x,y));
            }
        }
    }
}