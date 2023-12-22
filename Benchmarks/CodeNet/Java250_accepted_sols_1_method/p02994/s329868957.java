import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int n = Integer.parseInt(line1[0]);
        int l = Integer.parseInt(line1[1]);
        int[] ary = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            ary[i] = l + i;
            //System.out.println(ary[i]);
            if(ary[i] == 0)
            a = 1;
        }
        if(ary[0] < 0 && a == 0)
        a = 2;
        int sum = 0;
        switch(a){
            case 0:
                //System.out.println("case0");
                for(int i = 1; i < n; i++)
                sum += ary[i];
                break;
            case 1:
                //System.out.println("case1");
                for(int i = 0; i < n; i++)
                sum += ary[i];
                break;
            case 2:
                //System.out.println("case2");
                for(int i = 0; i < n - 1; i++)
                sum += ary[i];
                break;
        }
        System.out.println(sum);
    }
}