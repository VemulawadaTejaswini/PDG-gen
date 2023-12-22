import java.util.*;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int a = s.length();
            String b[] = s.split("");
            String[] comp1 = new String[a];
            String[] comp2 = new String[a];
            for(int i=0;i<a;i++) {
                comp1[i] = String.valueOf((i + 1)%2); //白スタート
                comp2[i] = String.valueOf((i)%2);
            }
            //差分比較
            int sum1=0;
            int sum2=0;
            for(int i=0;i<a;i++){
                if(!b[i].equals(comp1[i])){
                    sum1++;
                }else if(!b[i].equals(comp2[i])){
                    sum2++;
                }
            }
            int sum;
            if (sum1 < sum2) {
                sum = sum1;
            }else{
                sum = sum2;
            }
            System.out.println(sum);
        }

}

