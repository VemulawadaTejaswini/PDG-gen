import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int[] a =new int[3];
    int b = scan.nextInt();
        for (int j=0; j<b;j++){
            for (int i=0; i<3; i++){
                a[i]= scan.nextInt();
            }
            Arrays.sort(a);
            if((Math.pow(a[0],2)+ Math.pow(a[1],2)) == (Math.pow(a[2],2))){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}