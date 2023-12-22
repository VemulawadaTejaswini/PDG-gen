import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        long ans=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Long> nums = new ArrayList<>();
        for(int i=0;i<Math.pow(2,s.length()-1);i++){
            boolean[] bit = new boolean[s.length()-1];
            int temp = i;
            for(int j=0;j<s.length()-1;j++){
                bit[j]=temp%2==1;
                temp=temp>>1;
            }

            String num = ""+s.charAt(0);
            for(int j=0;j<s.length()-1;j++){
                if(bit[j]){
                    nums.add(Long.parseLong(num));
                    //System.out.print(num+" ");
                    num=""+s.charAt(j+1);
                }else{
                    num+=s.charAt(j+1);
                }
            }
            nums.add(Long.parseLong(num));
            //System.out.println();
        }

        for(Long k:nums){
            //System.out.println(ans);
            ans+=k;
        }


        System.out.println(ans);
    }

}
