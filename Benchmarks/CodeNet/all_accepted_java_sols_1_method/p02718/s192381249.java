import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        double[] num=new double[N];
        double sum=0;
        
        for(int i=0;i<N;i++){
            num[i]=sc.nextDouble();
            sum+=num[i];
        }
        
        Arrays.sort(num);
        
        if(num[N-M]<sum/(4*M)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
