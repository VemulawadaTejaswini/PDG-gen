
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.next();
        int num = sc.nextInt();
        while(sc.hasNext()){
            String operation = sc.next();
            if (operation.equals("print")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(str.substring(a, b + 1));
            } else if (operation.equals("reverse")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int point = b - a + 1;
                char arr[] = str.toCharArray();
                for (int i = 0; i < point / 2; i++){
                    char tmp = arr[a + i];
                    arr[a + i] = arr[b - i];
                    arr[b - i] = tmp;
                }
                str = new String(arr);
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();
                String part = sc.next();
                char arr[] = str.toCharArray();
                char partArr[] = part.toCharArray();
                int count = 0;
                for (int i = 0; i < arr.length; i++){
                    if (i >= a && i <= b){
                        arr[i] = partArr[count++];
                    }
                }
                str = new String(arr);
            }
        }
    }
}

