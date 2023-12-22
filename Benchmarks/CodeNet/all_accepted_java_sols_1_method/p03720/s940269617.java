import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] output=new int[n];
        for(int i=0;i<m;i++){
            output[sc.nextInt()-1]++;
            output[sc.nextInt()-1]++;
        }
        for(int a:output){
            System.out.println(a);
        }
    }
     
}