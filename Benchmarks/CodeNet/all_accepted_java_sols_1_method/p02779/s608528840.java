import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int m[]=new int[a];
        for(int i=0;i<a;i++)
            m[i]=sc.nextInt();
        Arrays.sort(m);
        int flag=0;
        for(int i=1;i<a;i++){
            if(m[i]==m[i-1]){
                System.out.println("NO");
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println("YES");

    }
}
