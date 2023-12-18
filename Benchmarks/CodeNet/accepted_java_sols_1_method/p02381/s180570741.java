import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            int n = sc.nextInt();
            sc.nextLine();
            if(n == 0)break;
            
            double sum = 0;
            
            int s[] = new int[n];
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            double ave = sum / n;
            
            double varian = 0;
            for(int i=0;i<n;i++){
                varian += Math.pow(s[i] - ave,2);
            }
            varian /= n;
            
            System.out.println(Math.sqrt(varian));
        }
    }
}
