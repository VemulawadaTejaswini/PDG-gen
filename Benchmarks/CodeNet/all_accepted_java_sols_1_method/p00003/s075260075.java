//Is it a Right Triangle?
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        String ans[] = new String[1000];
        
        int set = sc.nextInt();
        int i = 0;
        for(; i<set; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a*a==b*b+c*c || a*a+b*b==c*c || a*a+c*c==b*b) {
                ans[i] = "YES";
            }else {
                ans[i] = "NO";
            }
        }
        //System.out.println("i="+i);
        for(int j=0; j<i; j++) {
            System.out.println(ans[j]);
        }
    }
}