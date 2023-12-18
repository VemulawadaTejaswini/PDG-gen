import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        final dice d = new dice();
        for(int i = 0; i<6; i++)
            d.face[i] = Integer.parseInt(sc.next());
        final int n = Integer.parseInt(sc.next());
        for(int i = 0; i<n; i++){
            final int top = Integer.parseInt(sc.next());
            final int front = Integer.parseInt(sc.next());
            d.rotateto(top, front);
            out.println(d.face[2]);
        }
        out.flush();
    }
}

class dice{
    public int face[] = new int[6];
    private static final String dir = "EEENWWWSEEENWWWSEEENWWWS";
    public void rotate(char dir){
        int temp;
        switch(dir){
        case 'N':
            temp = face[0];
            face[0] = face[1];
            face[1] = face[5];
            face[5] = face[4];
            face[4] = temp;
            break;
        case 'E':
            temp = face[0];
            face[0] = face[3];
            face[3] = face[5];
            face[5] = face[2];
            face[2] = temp;
            break;
        case 'W':
            temp = face[0];
            face[0] = face[2];
            face[2] = face[5];
            face[5] = face[3];
            face[3] = temp;
            break;
        case 'S':
            temp = face[0];
            face[0] = face[4];
            face[4] = face[5];
            face[5] = face[1];
            face[1] = temp;
            break;
        }
    }
    public boolean rotateto(final int top, final int front){
        for(int i = 0; i<24; i++){
            if(face[0]==top&&face[1]==front) return true;
            rotate(dir.charAt(i));
        }
        return false;
    }
};