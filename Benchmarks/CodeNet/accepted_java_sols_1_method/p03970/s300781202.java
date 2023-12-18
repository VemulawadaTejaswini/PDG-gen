import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S;
        char[] c;
        int change=0;
        
        S = sc.next();
        c = S.toCharArray();
        
        
        if(c[0]!='C')change++;
        if(c[1]!='O')change++;
        if(c[2]!='D')change++;
        if(c[3]!='E')change++;
        if(c[4]!='F')change++;
        if(c[5]!='E')change++;
        if(c[6]!='S')change++;
        if(c[7]!='T')change++;
        if(c[8]!='I')change++;
        if(c[9]!='V')change++;
        if(c[10]!='A')change++;
        if(c[11]!='L')change++;
        if(c[12]!='2')change++;
        if(c[13]!='0')change++;
        if(c[14]!='1')change++;
        if(c[15]!='6')change++;
        
        System.out.println(change);
    }
}