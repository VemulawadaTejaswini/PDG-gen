import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        String[] t = sc.next().split("");

        int[] expected = new int[n];
        int res = 0;
        for(int i=0;i<n;i++){
            if(t[i].equals("r")){
                expected[i] = p;
            }
            else if(t[i].equals("s")){
                expected[i] = r;
            }
            else if(t[i].equals("p")){
                expected[i] = s;
            }
            res += expected[i];
        }

        int minus = 0;
        for(int i=0;i<k;i++){
            int pre_point = -1;
            String pre_str = "";
            int cnt = 1;
            for(int j=0;i+j<n;j+=k){
                if(t[i+j].equals(pre_str)){
                    cnt++;
                }
                else{
                    if(cnt > 1){
                        minus += pre_point * ((int)cnt/2);
                    }
                    cnt = 1;
                }
                pre_point = expected[i+j];
                pre_str = t[i+j];
            }
            if(cnt > 1){
                minus += pre_point * ((int)cnt/2);
            }
        }
        System.out.println(res-minus);
    }
}
