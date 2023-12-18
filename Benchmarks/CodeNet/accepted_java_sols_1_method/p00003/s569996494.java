import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        byte[] a = new byte[3];
        while(s.hasNext()){
            for(int i=0;i<3;i++)
                a[i] = s.nextByte();                
            Arrays.sort(a);
            if(a[2]*a[2] == a[0]*a[0] + a[1]*a[1])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}