import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[]x = new double[N];
    String[]y = new String[N];
    
    double all = 0;
    for(int i=0; i<N; i++){
        x[i] = sc.nextDouble();
        y[i] = sc.next();
        if(y[i].equals("JPY")){
        	all += x[i];
        }else {
        	all += x[i]*380000.0;
        }
    }       
        System.out.println(all);
    }
}