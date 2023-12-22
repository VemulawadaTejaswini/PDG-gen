import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        a[3] = sc.nextInt();
        a[4] = sc.nextInt();
        for(int i=0;i<5;i++){
            if(a[i]==0){
                System.out.println(i+1);
                return;
            }
        }        
        sc.close();
    }

}