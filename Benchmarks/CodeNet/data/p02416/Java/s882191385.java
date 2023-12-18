
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,b=0;
        while (true) {
            char a[] = sc.nextLine().toCharArray();
            if(a[0]-'0'==0){
                break;
            }
           for(int i=0;i<a.length;i++){
               b=a[i]-'0';
               sum=sum+b;
           }
        
           System.out.printf("%d\n",sum);
           sum=0;
        }
        sc.close();
    }

}
