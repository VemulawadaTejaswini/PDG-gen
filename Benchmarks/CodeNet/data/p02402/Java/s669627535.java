import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[]= new int[n];
        for(int i = 0; i < x.length ; i++){
            x[i]=sc.nextInt();
        }
        int max= x[0];
        int min= x[0];
        for(int i = 0 ; i < x.length ; i++){
            if(max < x[i])
                max = x[i];
            if(min > x[i])
                min = x[i];
            sum += x[i];
        }
        System.out.print(min+" "+max+" "+sum);
    }
}