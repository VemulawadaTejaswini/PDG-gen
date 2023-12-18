import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("-")) break;
            int n = str.length();
            char[] ch = new char[n];
            char[] newch = new char[n];

            for(int i = 0; i < n; i++){
                ch[i] = str.charAt(i);
            }

            int m = sc.nextInt();
            for(int i = 0; i < m; i++){
                int h = sc.nextInt();
                for(int j = 0; j < h; j++){
                    newch[n-h+j] = ch[j];
                }
                for(int j = 0; j < n - h; j++){
                    newch[j] = ch[j+h];
                }
                for(int j = 0; j < n; j++){
                    ch[j] = newch[j];
                }
            }

            for(int i = 0; i < n; i++){
                System.out.print(ch[i]);
            }
            System.out.println();
        }
    }
}

