import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        sc.close();
        int n = s.length;
        long sum = 0;
        long tmpSum = 0;
        long tmp = 0;
        for(int i=0;i<1<<(n-1);i++){
            tmpSum = 0;
            tmp = 0;
            for(int j=0;j<n-1;j++){
                if(((i>>j)&1)==1){
                    tmpSum+=tmp*10+s[j]-'0';
                    tmp = 0;
                }else{
                    tmp = tmp*10+s[j]-'0';
                }
            }
            tmpSum+=tmp*10+s[n-1]-'0';
            sum+=tmpSum;
        }
        System.out.println(sum);
    }
}