import java.io.IOException;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] Args) throws IOException{
        final dice d = new dice();
        for(int i = 0; i<6; i++)
            d.face[i] = Integer.parseInt(sc.next());
        final String dir = sc.next();
        for(int i = 0; i<dir.length(); i++){
            d.rotate(dir.charAt(i));
        }
        System.out.println(d.face[0]);
    }
}

class dice{
    public int face[] = new int[6];
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
};