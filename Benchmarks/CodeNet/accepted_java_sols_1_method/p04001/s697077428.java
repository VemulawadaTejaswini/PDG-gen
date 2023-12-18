import java.util.Scanner;

// bit全探索を用いた解法
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int end=(1<<(s.length()-1));
        long ret=0;
        // bit部分のループ
        for(int i=0;i<end;i++){
            // 式を生成しながら計算
            long tmp=Character.getNumericValue(s.charAt(0));
            for(int j=1;j<s.length();j++){
                // 手前に+を入れる時
                if((i&(1<<(j-1)))>0){
                    ret+=tmp;
                    tmp=Character.getNumericValue(s.charAt(j));
                }
                // +を入れない時
                else{
                    tmp=tmp*10+Character.getNumericValue(s.charAt(j));
                }
            }
            ret+=tmp;
        }
        System.out.println(ret);
    }
}
