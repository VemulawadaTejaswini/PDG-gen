import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] accept = new int[n+1];
        int[] fail = new int[n+1];
        int ACsum = 0;
        int WAsum = 0;
        for(int i =0;i<m;i++){
            Integer p = sc.nextInt();
            String acwa = sc.next();
            if(accept[p]==1)continue;
            if(acwa.equals("AC")){
                accept[p] = 1;
                ACsum++;
                WAsum+=fail[p];
            }
            else{
                fail[p]++;
            }
        }
        System.out.println(ACsum + " " + WAsum);
        
    }
}
