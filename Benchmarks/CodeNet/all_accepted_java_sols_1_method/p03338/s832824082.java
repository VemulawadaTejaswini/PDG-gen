import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        String s = scn.next();
        int answer = 0;
        int[] check = new int[26];
        Arrays.fill(check, 0);
        for(int i=1;i<n;i++){
            String a=s.substring(0, i);
            String b=s.substring(i,n);
           // System.out.println(a+" : "+b);  //test
           int cnt=0;
           Arrays.fill(check, 0);
           for(int j=0;j<a.length();j++){
                for(int k=0;k<b.length();k++){
                    if(a.charAt(j)==b.charAt(k)){
                        if(check[Character.getNumericValue(a.charAt(j))-Character.getNumericValue('a')]==0) cnt++;
                        check[Character.getNumericValue(a.charAt(j))-Character.getNumericValue('a')]++;
                    }
                }
           }
           if(answer<cnt){
            answer = cnt;
           }
        }
        System.out.println(answer);
    }
}
