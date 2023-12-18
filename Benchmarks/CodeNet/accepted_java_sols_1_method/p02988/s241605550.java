
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }

        List<Integer> lst =new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(p[i]<=p[i+1]&&p[i+1]<=p[i+2]){
                lst.add(p[i+1]);
            }else if(p[i]>=p[i+1]&&p[i+1]>=p[i+2]){
                lst.add(p[i+1]);
            }

        }

            System.out.println(lst.size());



    }
}

