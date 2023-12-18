import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String X = sc.nextLine();
        String Y = sc.nextLine();

        String[] sa1 = X.split(" ");
        String[] sa2 = Y.split(" ");

        int[] a1 = new int[sa1.length];
        int[] a2 = new int[sa2.length];

        for(int i=0; i<sa1.length;i++){
            a1[i]=Integer.parseInt(sa1[i]);
            a2[i]=Integer.parseInt(sa2[i]);
        }

        int ret=0;

        for(int i=0;i<a1.length;i++){
            int sum=0;
            for(int j=0;j<a1.length;j++){
                if(j<=i){
                    sum+=a1[j];
                }else{
                    sum+=a2[j];
                }
            }
            sum+=a2[i];
            ret=Math.max(ret,sum);
        }

        System.out.println(ret);

    }
}