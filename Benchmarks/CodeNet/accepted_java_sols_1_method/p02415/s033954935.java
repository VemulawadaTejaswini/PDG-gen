import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) {
        char[] c=new char[1];
        int A=(int)'A';
        int a=(int)'a';
        int x=A-a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            for(int i=0;i<str.length();i++){
                str.getChars(i,i+1,c,0);
                if('A'<=c[0]&&c[0]<='Z'){
                    System.out.print((char)(c[0]-x));
                }else if('a'<=c[0]&&c[0]<='z'){
                    System.out.print((char)(c[0]+x));
                }else System.out.print((char)c[0]);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

