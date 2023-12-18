import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] m, f, r;
        int i, k;

        m = new int[50];
        f = new int[50];
        r = new int[50];

        i=0;
        while(true){
            if(i == 50){break;}

            m[i] = sc.nextInt();
            f[i] = sc.nextInt();
            r[i] = sc.nextInt();

            if(m[i] == -1 && f[i] == -1 && r[i] == -1){break;}

            i++;
        }

        for(k=0;k<i;k++){
            if(m[k] == -1 || f[k] == -1){
                System.out.println("F");
            }else if( m[k]+f[k] >= 80 ){
                System.out.println("A");
            }else if( m[k]+f[k] >= 65 ){
                System.out.println("B");
            }else if( m[k]+f[k] >= 50 ){
                System.out.println("C");
            }else if( m[k]+f[k] >= 30 ){
                if(r[k] >= 50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            } else {
                System.out.println("F");
            }
        }
    }
}

