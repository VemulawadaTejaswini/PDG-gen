import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str = "";
        int x;
        int n = scanner.nextInt();
        short[] s = new short[13];
        short[] h = new short[13];
        short[] c = new short[13];
        short[] d = new short[13];

        for(int i = 0; i < n; i++){
            str = scanner.next();
            x = scanner.nextInt();
            if(str.equals("S"))s[x-1] = 1;
            if(str.equals("H"))h[x-1] = 1;
            if(str.equals("C"))c[x-1] = 1;
            if(str.equals("D"))d[x-1] = 1;
        }
        for(int i = 0; i < 13; i++){
            if(s[i] == 0)System.out.println("S "+(i+1));
        }
        for(int i = 0; i < 13; i++){
            if(h[i] == 0)System.out.println("H "+(i+1));
        }
        for(int i = 0; i < 13; i++){
            if(c[i] == 0)System.out.println("C "+(i+1));
        }
        for(int i = 0; i < 13; i++){
            if(d[i] == 0)System.out.println("D "+(i+1));
        }


    }
}

