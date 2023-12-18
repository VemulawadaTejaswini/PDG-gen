import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int min=0;
        int max=0;
        long sum=0;
        
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(sc.next());
            if(i==0){
                min = a;
                max = a;
            }
            min = Math.min(min,a);
            max = Math.max(max,a);
            sum+=a;
        }
        
        System.out.println(min+" "+max+" "+sum);
    }

}

