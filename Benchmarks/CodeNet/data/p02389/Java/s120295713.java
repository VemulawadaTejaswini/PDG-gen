import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        //??¢?????¨??¨????????????????±???????
        int iMenseki = a * b;
        int iMawari = (a + b) * 2;
        
        System.out.println(""+ iMenseki +" " + "" + iMawari + "");
    }
}