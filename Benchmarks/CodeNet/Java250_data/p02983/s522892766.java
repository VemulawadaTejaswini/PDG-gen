import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        long mod=0;

        int l = L%2019;
        int r = R%2019;
        int l1 = L/2019;
        int r1 = R/2019;

        if(R-L +1 >=2019){//large enough to contain 2019 multiples
            mod =0;
        }else if(l==0 || r ==0){//contain 2019 multiple at edge
            mod = 0;
        }else if ( r1!=l1){// contains 2019 in between
            mod =0;
        }else{
            int min = Integer.MAX_VALUE;
            for(int i= l; i < r ; ++i){
                for (int j = l+1; j <=r ; j++) {
                    int multi = i*j;
                    int mod2 = multi%2019;
                    min = Math.min(min, mod2);
                }
            }
            if(min!=Integer.MAX_VALUE){
                mod = min;
            }
        }



        System.out.println(mod);

    }

}
