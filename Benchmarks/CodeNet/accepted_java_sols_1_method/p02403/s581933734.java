import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int i,a,b;
        int[] m,n;
        m = new int[100];
        n = new int[100];
        Scanner scan = new Scanner(System.in);
        for(i=0;i<100;i++){
            m[i] = scan.nextInt();
            n[i] = scan.nextInt();
            if(m[i]==0 && n[i]==0) break;
        }
        for(i=0;i<100;i++){
            if(m[i]==0 && n[i]==0) break;
            for(a=0;a<m[i];a++){
                for(b=0;b<n[i];b++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
    }
}
