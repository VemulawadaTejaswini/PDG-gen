import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        	double dispersion = 0;
            double a = 0;
            int n = sc.nextInt();
            int[] s = new int[n];
            if(n==0){
            	break;
            }
            double m = 0;
            for(int i=0; i < n; i++){
            	s[i] = sc.nextInt();
            	m += s[i];
            }
            m = m/n;
            for(int j=0; j<n; j++){
            	dispersion += (s[j]-m)*(s[j]-m);
            }
            dispersion = dispersion / n;
            //System.out.println("dispersion:"+dispersion);
            a = Math.sqrt(dispersion);
            System.out.println(a);
        }

    }
}

