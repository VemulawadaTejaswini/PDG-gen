import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        String b=sc.next();
        char m[]=b.toCharArray();
        if(a<3)
            System.out.println("0");
        else{
            int count=0;
            for(int i=2;i<m.length;i++){
                if(m[i-2]=='A'&&m[i-1]=='B'&&m[i]=='C')
                    count++;
            }
            System.out.println(count);
        }

    }
}
