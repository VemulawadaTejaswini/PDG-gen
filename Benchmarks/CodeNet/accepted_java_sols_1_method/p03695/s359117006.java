import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] array = new int[8];
        int free=0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(temp<400) array[0]++;
            else if(temp<800) array[1]++;
            else if(temp<1200) array[2]++;
            else if(temp<1600) array[3]++;
            else if(temp<2000) array[4]++;
            else if(temp<2400) array[5]++;
            else if(temp<2800) array[6]++;
            else if(temp<3200) array[7]++;
            else free++;
        }
        int ans=0;
        for(int i=0;i<8;i++){
            if(array[i]!=0)  ans++;
        }
        if(ans==0) System.out.println(1+" "+free);
        else System.out.println(ans+" "+(ans+free));
        sc.close();
    }
}