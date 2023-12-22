import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
        String s = sc.next();
        char[] schar = s.toCharArray();
        boolean[] ans = new boolean[n];
        int countA =0,countB = 0;
        for(int i = 0;i<n;i++){
            if(schar[i]=='a'){
                if(countA<a+b){
                    ans[i] = true;
                    countA ++;
                }
            }
            if(schar[i]=='b'){
                if((countA<a+b)&&(countB<b)){
                    ans[i] = true;
                    countA ++;
                    countB ++;
                }
            }
        }
        for(int i =0 ;i<n;i++){
            if(ans[i]){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}