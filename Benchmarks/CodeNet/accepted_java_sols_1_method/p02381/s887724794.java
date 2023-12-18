import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n>0){
            int sum=0;
            int[] s = new int[n];
            for(int i=0;i<n;i++){
                s[i]=scan.nextInt();
                sum+=s[i];
            }
            double ave = (double)sum/n;
            //System.out.println(ave);
            double HF=0;
            for(int i=0;i<n;i++){
                HF+=(ave-s[i])*(ave-s[i]);
            }
            HF/=(double)n;
            HF=Math.pow(HF,0.5);
            System.out.println(HF);
            n = scan.nextInt();
        }
    }
}
